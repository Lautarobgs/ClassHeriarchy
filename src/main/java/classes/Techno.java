package classes;

public class Techno extends MusicGenre{
  private String bestProducer;

  public Techno(String name, String origin, String bestProducer) {
    super(name, origin);
    this.bestProducer = bestProducer;
  }

  @Override
  public void play() {
    System.out.println("Now listening to Techno");
  }

  public String getBestProducer() {
    return bestProducer;
  }

  public void setBestProducer(String bestProducer) {
    this.bestProducer = bestProducer;
  }
}
