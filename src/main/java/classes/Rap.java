package classes;

public class Rap extends MusicGenre{
  private Boolean isFreestyle;

  public Rap(String name, String origin, Boolean isFreestyle) {
    super(name, origin);
    this.isFreestyle = isFreestyle;
  }

  @Override
  public void play() {
    System.out.println("Now listening to Rap");
  }

  public Boolean getFreestyle() {
    return isFreestyle;
  }

  public void setFreestyle(Boolean freestyle) {
    isFreestyle = freestyle;
  }
}
