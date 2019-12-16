package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Publisher {
    private long id;

    //Name of game publisher
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