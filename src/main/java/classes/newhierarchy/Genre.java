package classes.newhierarchy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
