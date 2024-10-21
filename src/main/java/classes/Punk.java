package classes;

import interfaces.IPunk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Punk extends MusicGenre implements IPunk {
  @XmlElement(name = "style")
  private String style;
  private static final Logger logger = LogManager.getLogger(Punk.class);
  public Punk(String name, String origin, String style) {
    super(name, origin);
    this.style = style;
  }

  public Punk() {
    // Default constructor for JAXB
  }
  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  @Override
  public void play() {
    logger.info("Now listening to punk");
  }

  @Override
  public void getBandInfo() {
    logger.info("lorem ipsum");
  }

  @Override
  public String toString() {
    return "Punk{" +
            "style='" + style + '\'' +
            '}';
  }
}
