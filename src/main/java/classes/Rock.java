package classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rock extends MusicGenre{
  private Integer totalStreams;
  private static final Logger logger = LogManager.getLogger(Rock.class);
  public Rock(String name, String origin, Integer totalStreams) {
    super(name, origin);
    this.totalStreams = totalStreams;
  }

  @Override
  public void play(){
    logger.info("Now playing rock");
  }

  public Integer getTotalStreams() {
    return totalStreams;
  }

  public void setTotalStreams(Integer totalStreams) {
    this.totalStreams = totalStreams;
  }
}
