package classes;

import exceptions.MaxSingerException;

import java.util.List;

public final class SingerZ {

    public final Integer MAX_SINGERS = 10;
    private static  Long totalSingers = 0L;

    private String name;
    private Integer age;
    private Long id;
    private List<MusicGenre> allGenres;
    public SingerZ(String name, Integer age, List<MusicGenre> allGenres) throws MaxSingerException {
        if (totalSingers >= MAX_SINGERS) {
            throw new MaxSingerException("Cannot create more than " + MAX_SINGERS + " singers.");
        }
        this.name = name;
        this.age = age;
        this.allGenres = allGenres;
        this.id = totalSingers++;
    }
    public static void totalSingers(){
        System.out.println("There are a total of:" + totalSingers + " singers");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<MusicGenre> getAllGenres() {
        return allGenres;
    }

    public void setAllGenres(List<MusicGenre> allGenres) {
        this.allGenres = allGenres;
    }

}
