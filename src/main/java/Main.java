import classes.*;
import exceptions.MaxSingerException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;

public class Main {
  private static  Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args) {

    ArrayList<String> instruments = new ArrayList<String>();
    instruments.add("Electric Guitar");
    instruments.add("Keyboard");
    instruments.add("Drums");

    ///Usage of polymorphism
    MusicGenre rock = new Rock("Classic rock","50s",1000000000);
    MusicGenre indie =  new IndieZ("Alternative","60s","United States");
    MusicGenre metal =  new Metal("Power Metal","80s",instruments);
    List<MusicGenre> genres = new ArrayList<MusicGenre>();
      genres.add(rock);
      genres.add(indie);
      genres.add(metal);
    for (MusicGenre genre : genres) {
      genre.play();
    }
    ((IndieZ)indie).showLyrics(); ///Casting IndieZ into MusicGenre

    try {
      for (int i = 0; i < 12; i++) {
        SingerZ singer = new SingerZ("Singer " + i, 25, new ArrayList<>());
        logger.debug("Created");
      }
    } catch (MaxSingerException e) {
      logger.warn(e.getMessage());
    }

  }
}
