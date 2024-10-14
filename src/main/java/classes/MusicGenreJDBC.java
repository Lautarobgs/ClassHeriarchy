package classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MusicGenreJDBC {
    private static final Logger log = LogManager.getLogger(MusicGenreJDBC.class);
    protected String name;
    protected Long id;
    protected String origin;
    protected Integer bpm;

    public MusicGenreJDBC(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public MusicGenreJDBC(String name, Long id) {
        this.name = name;
        this.id = id;
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

    public Integer getBpm() {
        return bpm;
    }

    public void setBpm(Integer bpm) {
        this.bpm = bpm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
