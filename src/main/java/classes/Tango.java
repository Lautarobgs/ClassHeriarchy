package classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tango extends MusicGenre{
  private String impact;
  private static final Logger logger = LogManager.getLogger(Tango.class);
  public Tango(String name, String origin, String impact) {
    super(name, origin);
    this.impact = impact;
  }

  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  @Override
  public void play() {
    logger.info("Now playing to Tango");
  }
}
