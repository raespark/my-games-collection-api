package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Developer {
    private long id;

    //Name of development studio
    private String name;

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}