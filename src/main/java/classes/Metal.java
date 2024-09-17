package classes;

import interfaces.IMetal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Metal extends MusicGenre implements IMetal {
  protected ArrayList<String> instruments;
  private static final Logger logger = LogManager.getLogger(Metal.class);
  public Metal(String name, String origin, ArrayList<String> instruments) {
    super(name, origin);
    this.instruments = instruments;
  }

  @Override
  public void play() {
    System.out.println("Now listening to Metal");
  }

  public List<String> getInstruments() {
    return instruments;
  }

  public void setInstruments(ArrayList<String> instruments) {
    this.instruments = instruments;
  }

  ///Overriding equals/hashcode/toString
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metal metal = (Metal) o;
    return Objects.equals(instruments, metal.instruments);
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(instruments);
  }
  @Override
  public String toString() {
    return "Metal{" +
      "instruments=" + instruments +
      '}';
  }

  @Override
  public void deleteSong() {
    logger.info("Song succesfully deleted");
  }
}
