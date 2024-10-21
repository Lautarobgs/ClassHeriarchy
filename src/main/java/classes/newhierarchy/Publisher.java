package classes.newhierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Publisher {
    @JsonProperty("name")
    private String name;

    @JsonProperty("yearFounded")
    private int yearFounded;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }
}
