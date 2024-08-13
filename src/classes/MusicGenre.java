package classes;

public abstract class MusicGenre {
  protected String name;
  protected String origin;
  protected Integer bpm;

  public MusicGenre(String name, String origin) {
    this.name = name;
    this.origin = origin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }
  public abstract void play();

  public Integer getBpm() {
    return bpm;
  }

  public void setBpm(Integer bpm) {
    this.bpm = bpm;
  }
}
