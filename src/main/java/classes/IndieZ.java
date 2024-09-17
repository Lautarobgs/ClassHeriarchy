package classes;

import interfaces.IIndieZ;
import interfaces.IMusicGenre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class IndieZ extends MusicGenre implements IIndieZ {
  private String countryOrigin;
  private static final Logger logger = LogManager.getLogger(IndieZ.class);

  ///Overloading
  public IndieZ(String name, String origin, String countryOrigin) {
    super(name, origin);
    this.countryOrigin = countryOrigin;
  }

  public IndieZ(String name, String origin) {
    super(name, origin);
  }

  static {
    logger.debug("Loading IndieZ class...");
  }
  ///Overriding abstract method
  @Override
  public void play() {
    System.out.println("Now listening to Indie");
  }

  ///Overriding equals,toString & hashCode
  @Override
  public String toString() {
    return super.toString() + ", originating in the country of " + countryOrigin;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IndieZ indieZ = (IndieZ) o;
    return Objects.equals(countryOrigin, indieZ.countryOrigin);
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(countryOrigin);
  }


  public String getCountryOrigin() {
    return countryOrigin;
  }

  public void setCountryOrigin(String countryOrigin) {
    this.countryOrigin = countryOrigin;
  }

  @Override
  public void pause() {
    logger.info("Music paused");
  }

  @Override
  public void skipSong() {
    logger.info("Song skipped");
  }

  @Override
  public void showLyrics() {
    String path = "src/main/java/resources/lyrics.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linea;
      while ((linea = reader.readLine()) != null) {
        logger.info(linea);
      }
    } catch (IOException e) {
      logger.error("Error reading the lyrics: " + path, e);
    }
  }

  public final void previousSong(){
    System.out.println("Now playing previous song");
  }

}
