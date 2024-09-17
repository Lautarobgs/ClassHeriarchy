package classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Techno extends MusicGenre{
  private String bestProducer;
  private static final Logger logger = LogManager.getLogger(Techno.class);
  public Techno(String name, String origin, String bestProducer) {
    super(name, origin);
    this.bestProducer = bestProducer;
  }

  @Override
  public void play() {
    logger.info("Now listening to Techno");
  }

  public String getBestProducer() {
    return bestProducer;
  }

  public void setBestProducer(String bestProducer) {
    this.bestProducer = bestProducer;
  }
}
