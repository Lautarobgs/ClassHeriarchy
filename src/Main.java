import classes.IndieZ;
import classes.Metal;
import classes.MusicGenre;
import classes.Rock;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> instruments = new ArrayList<String>();
    instruments.add("Electric Guitar");
    instruments.add("Keyboard");
    instruments.add("Drums");

    ///Usage of polymorphism
    MusicGenre rock = new Rock("Classic rock","50s",1000000000);
    MusicGenre indie =  new IndieZ("Alternative","60s","United States");
    MusicGenre metal =  new Metal("Power Metal","80s",instruments);
    List<MusicGenre> genres = new ArrayList<MusicGenre>();
      genres.add(rock);
      genres.add(indie);
      genres.add(metal);
    for (MusicGenre genre : genres) {
      genre.play();
    }
  }
}
