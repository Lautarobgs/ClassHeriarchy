package classes;

import interfaces.IMusicGenre;
import interfaces.IPop;

import java.util.Objects;

public class Pop extends MusicGenre implements IPop {
  protected String mostStreamedArtist;
  private Float speed;
  public Pop(String name, String origin, String mostStreamedArtist) {
    super(name, origin);
    this.speed = 1F;
    this.mostStreamedArtist = mostStreamedArtist;
  }

  public String getMostStreamedArtist() {
    return mostStreamedArtist;
  }

  public void setMostStreamedArtist(String mostStreamedArtist) {
    this.mostStreamedArtist = mostStreamedArtist;
  }

  @Override
  public void play() {
    System.out.println("Now listening to Pop");
  }


  ///Overriding equals,hashcode,toString
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pop pop = (Pop) o;
    return Objects.equals(mostStreamedArtist, pop.mostStreamedArtist);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(mostStreamedArtist);
  }

  @Override
  public String toString() {
    return "Pop{" +
      "mostStreamedArtist='" + mostStreamedArtist + '\'' +
      ", name='" + name + '\'' +
      ", origin='" + origin + '\'' +
      ", bpm=" + bpm +
      '}';
  }

  @Override
  public void changeSpeed(Float newspeed) {
    this.speed = (this.speed/newspeed);
  }
}
