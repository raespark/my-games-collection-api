package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Screenshot {
    private long id;

    //Image url
    private String url;

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getUrl() {
        return url;
    }
}