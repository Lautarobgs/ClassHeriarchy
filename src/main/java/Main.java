import classes.*;
import exceptions.MaxSingerException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

  private static  Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args) throws Exception{
    String txtRoute = "src/main/java/resources/lyrics.txt";
    logger.info("There are a total of: " +UniqueWordCounter.countUniqueWords(txtRoute) +" unique word");
ArrayList<String> instruments = new ArrayList<String>();
    instruments.add("Electric Guitar");
    instruments.add("Keyboard");
    instruments.add("Drums");
    Set<String> instrumentsSet = new HashSet<String>();
    instrumentsSet.add("Piano");
    instrumentsSet.add("Acoustic guitar");
    instrumentsSet.add("Flute");
    ///Usage of polymorphism
    MusicGenre rock = new Rock("Classic rock","50s",1000000000);
    MusicGenre indie =  new IndieZ("Alternative","60s","United States");
    MusicGenre metal =  new Metal("Power Metal","80s",instruments);
    List<MusicGenre> genres = new ArrayList<MusicGenre>();
      genres.add(rock);
      genres.add(indie);
      genres.add(metal);

    //1- Filter instruments containing guitar
    Predicate<String> containsGuitar = instrument -> instrument.contains("Guitar");
    List<String> guitarInstruments = instruments.stream()
            .filter(containsGuitar)
            .toList();
    logger.info("Instruments containing 'Guitar': " + guitarInstruments);

    //2-Convert instrument names to uppercase, it would be better if i use UnaryOperator tbh
    Function<String, String> toUpperCase = String::toUpperCase;
    List<String> upperCaseInstruments = instruments.stream()
            .map(String::toUpperCase)
            .toList();
    logger.info("Instruments in uppercase: " + upperCaseInstruments);

    //3- Consumer to log each instrument in the set
    Consumer<String> logInstrument = instrument -> logger.info("Instrument: " + instrument);
    instrumentsSet.forEach(logInstrument);

    //4- Default instrument
    Supplier<String> defaultInstrument = () -> "Unknown Instrument";
    logger.info("Default Instrument: " + defaultInstrument.get());

    //5- Combine two instrument names
    BinaryOperator<String> combineInstruments = (i1, i2) -> i1 + " & " + i2;
    String combinedInstrument = combineInstruments.apply(instruments.get(0), instruments.get(1));
    logger.info("Combined Instruments: " + combinedInstrument);

    //6- Sort musical genre by name
      List<MusicGenre> sortedGenres = genres.stream()
              .sorted(Comparator.comparing(MusicGenre::getName)) // Non-terminal
              .collect(Collectors.toList()); // Terminal
      logger.info("Sorted Genres: " + sortedGenres);

    //7-Count genres
      long genreCount = genres.stream()
              .count();
      logger.info("Total genres: " + genreCount);

    for (MusicGenre genre : genres) {
      genre.play();

    }


    //Reflection
      Class<?> clazz = IndieZ.class;
    ///Obtain field info
      Field[] fields = clazz.getDeclaredFields();
      for (Field field : fields) {
          logger.info("Field: " + field.getName());
          logger.info("Type: " + field.getType());
          logger.info("Modifiers: " + Modifier.toString(field.getModifiers()));
      }

    ///Constructor info
      Constructor<?>[] constructors = clazz.getConstructors();
      for (Constructor<?> constructor : constructors) {
          logger.info("Constructor: " + constructor.getName());
          logger.info("Parameter count: " + constructor.getParameterCount());
      }
    ///Method info
      Method[] methods = clazz.getDeclaredMethods();
      for (Method method : methods) {
          logger.info("Method: " + method.getName());
          logger.info("Return type: " + method.getReturnType());
          logger.info("Parameter count: " + method.getParameterCount());
      }

    ///Create rock object via reflection
      Class<?> rockClass = Rock.class;

      // Obtaining el constructor
      Constructor<?> rockConstructor = rockClass.getConstructor(String.class, String.class, Integer.class);

      // Creating new instance
      Object rockInstance = rockConstructor.newInstance("Classic Rock", "50s", 1000000000);

      // Use reflection to invoke method
      Method playMethod = rockClass.getMethod("play");
      playMethod.invoke(rockInstance);  // Invocar el método play()


    ((IndieZ)indie).showLyrics(); ///Casting IndieZ into MusicGenre

    try {
      for (int i = 0; i < 12; i++) {
        SingerZ singer = new SingerZ("Singer " + i, 25, new ArrayList<>());
        logger.debug("Created");
      }
    } catch (MaxSingerException e) {
      logger.warn(e.getMessage());
    }
  }
}
