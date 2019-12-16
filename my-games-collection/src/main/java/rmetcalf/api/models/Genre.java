package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {
    private long id;

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