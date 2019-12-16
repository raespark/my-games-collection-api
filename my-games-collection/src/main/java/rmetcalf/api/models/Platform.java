package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Platform {
    private long id;

    private String name;

    //Image Url for Platform Logo
    private String logo;

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getLogo() {
        return logo;
    }
}