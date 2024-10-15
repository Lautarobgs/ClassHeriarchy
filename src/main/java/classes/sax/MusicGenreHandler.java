package classes.sax;
import classes.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.validation.*;
import org.xml.sax.SAXException;
import java.util.ArrayList;
import java.util.List;

public class MusicGenreHandler {
    private File xmlFile;
    private File xsdFile;
    private static final Logger logger = LogManager.getLogger(MusicGenreHandler.class);

    public MusicGenreHandler(String xmlFilePath, String xsdFilePath) {
        this.xmlFile = new File(xmlFilePath);
        this.xsdFile = new File(xsdFilePath);
    }


    public void validateXML() throws SAXException, IOException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        Schema schema = schemaFactory.newSchema(xsdFile);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setSchema(schema);
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.parse(xmlFile);
            logger.info("XML file is valid.");
        } catch (ParserConfigurationException | SAXException e) {
            throw new SAXException("XML validation error: " + e.getMessage());
        }
    }

    public List<MusicGenre> processMusicGenres() throws Exception {
        List<MusicGenre> musicGenres = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        NodeList genres = doc.getElementsByTagName("*");
        for (int i = 0; i < genres.getLength(); i++) {
            Node genre = genres.item(i);
            if (genre.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) genre;

                // Verifica que los nodos existen antes de intentar obtener el texto
                String name = getTagValue(element, "name");
                String origin = getTagValue(element, "origin");

                MusicGenre genreInstance = null;
                switch (element.getTagName()) {
                    case "IndieZ":
                        String countryOrigin = getTagValue(element, "countryOrigin");
                        genreInstance = new IndieZ(name, origin, countryOrigin);
                        break;
                    case "Metal":
                        NodeList instruments = element.getElementsByTagName("instrument");
                        ArrayList<String> instrumentsList = new ArrayList<>();
                        for (int j = 0; j < instruments.getLength(); j++) {
                            instrumentsList.add(instruments.item(j).getTextContent());
                        }
                        genreInstance = new Metal(name, origin, instrumentsList);
                        break;
                    case "Pop":
                        String mostStreamedArtist = getTagValue(element, "mostStreamedArtist");
                        genreInstance = new Pop(name, origin, mostStreamedArtist);
                        break;
                    case "Punk":
                        String style = getTagValue(element, "style");
                        genreInstance = new Punk(name, origin, style);
                        break;
                    case "Classic":
                        String era = getTagValue(element, "era");
                        NodeList mainArtists = element.getElementsByTagName("mainArtists");
                        ArrayList<String> artistsList = new ArrayList<>();
                        for (int j = 0; j < mainArtists.getLength(); j++) {
                            artistsList.add(mainArtists.item(j).getTextContent());
                        }
                        genreInstance = new Classic(name, origin, era, artistsList);
                        break;
                }
                if (genreInstance != null) {
                    musicGenres.add(genreInstance);
                }
            }
        }
        return musicGenres;
    }

    private String getTagValue(Element element, String tagName) {
        NodeList nodeList = element.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return null;
    }
}
