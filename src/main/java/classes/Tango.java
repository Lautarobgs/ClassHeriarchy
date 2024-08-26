package classes;

public class Tango extends MusicGenre{
  private String impact;

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
    System.out.println("Now playing to Tango");
  }
}
