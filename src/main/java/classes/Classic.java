package classes;

import java.util.ArrayList;
import java.util.List;

public class Classic extends MusicGenre{
  private String era;
  private ArrayList<String> mainArtists;
  public Classic(String name, String origin, String era, ArrayList<String> mainArtists) {
    super(name, origin);
    this.era = era;
    this.mainArtists = mainArtists;
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
