package classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rap extends MusicGenre{
  private Boolean isFreestyle;
  private static final Logger logger = LogManager.getLogger(Rap.class);
  public Rap(String name, String origin, Boolean isFreestyle) {
    super(name, origin);
    this.isFreestyle = isFreestyle;
  }

  @Override
  public void play() {
    logger.info("Now listening to Rap");
  }

  public Boolean getFreestyle() {
    return isFreestyle;
  }

  public void setFreestyle(Boolean freestyle) {
    isFreestyle = freestyle;
  }
}
