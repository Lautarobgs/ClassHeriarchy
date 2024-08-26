package classes;

public class Classic extends MusicGenre{
  private String era;

  public Classic(String name, String origin, String era) {
    super(name, origin);
    this.era = era;
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

}
