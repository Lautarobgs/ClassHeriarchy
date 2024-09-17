package classes;

import interfaces.IPunk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Punk extends MusicGenre implements IPunk {
  private String style;
  private static final Logger logger = LogManager.getLogger(Punk.class);
  public Punk(String name, String origin, String style) {
    super(name, origin);
    this.style = style;
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
}
