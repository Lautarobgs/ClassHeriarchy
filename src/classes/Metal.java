package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Metal extends MusicGenre{
  protected ArrayList<String> instruments;

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
}
