package classes;

public class Rock extends MusicGenre{
  private Integer totalStreams;

  public Rock(String name, String origin, Integer totalStreams) {
    super(name, origin);
    this.totalStreams = totalStreams;
  }

  @Override
  public void play(){
    System.out.println("Now playing rock");
  }

  public Integer getTotalStreams() {
    return totalStreams;
  }

  public void setTotalStreams(Integer totalStreams) {
    this.totalStreams = totalStreams;
  }
}
