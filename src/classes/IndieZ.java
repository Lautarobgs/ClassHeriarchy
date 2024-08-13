package classes;

import java.util.Objects;

public class IndieZ extends MusicGenre{
  private String countryOrigin;


  ///Overloading
  public IndieZ(String name, String origin, String countryOrigin) {
    super(name, origin);
    this.countryOrigin = countryOrigin;
  }

  public IndieZ(String name, String origin) {
    super(name, origin);
  }

  ///Overriding abstract method
  @Override
  public void play() {
    System.out.println("Now listening to Indie");
  }

  ///Overriding equals,toString & hashCode
  @Override
  public String toString() {
    return super.toString() + ", originating in the country of " + countryOrigin;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IndieZ indieZ = (IndieZ) o;
    return Objects.equals(countryOrigin, indieZ.countryOrigin);
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(countryOrigin);
  }


  public String getCountryOrigin() {
    return countryOrigin;
  }

  public void setCountryOrigin(String countryOrigin) {
    this.countryOrigin = countryOrigin;
  }
}
