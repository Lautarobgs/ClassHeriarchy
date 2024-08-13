package classes;

public class Punk extends MusicGenre{
  private String style;

  public Punk(String name, String origin, String style) {
    super(name, origin);
    this.style = style;
  }

  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  @Override
  public void play() {
    System.out.println("Now listening to punk");
  }
}
