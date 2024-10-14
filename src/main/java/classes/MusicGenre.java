package classes;

import interfaces.IMusicGenre;

public abstract class MusicGenre implements IMusicGenre {
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

  @Override
  public abstract void play();

  public Integer getBpm() {
    return bpm;
  }

  public void setBpm(Integer bpm) {
    this.bpm = bpm;
  }

  @Override
  public String toString() {
    return "MusicGenre{" +
            "name='" + name + '\'' +
            ", origin='" + origin + '\'' +
            ", bpm=" + bpm +
            '}';
  }
}
