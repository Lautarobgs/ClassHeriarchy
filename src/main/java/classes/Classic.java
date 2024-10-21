package classes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Classic extends MusicGenre{
  public ArrayList<String> getMainArtists() {
    return mainArtists;
  }

  @XmlElement(name = "era")
  private String era;
  @XmlElement(name = "mainArtists")
  private ArrayList<String> mainArtists;
  public Classic(String name, String origin, String era, ArrayList<String> mainArtists) {
    super(name, origin);
    this.era = era;
    this.mainArtists = mainArtists;
  }
  public Classic() {
    // Default constructor for JAXB
  }
  @Override
  public void play() {
    System.out.println("Now listening to classic music");
  }

  public String getEra() {
    return era;
  }

  public void setEra(String era) {
    this.era = era;
  }

  @Override
  public String toString() {
    return "Classic{" +
            "era='" + era + '\'' +
            ", mainArtists=" + mainArtists +
            '}';
  }
}
