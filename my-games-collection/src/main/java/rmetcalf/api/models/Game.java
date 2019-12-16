package rmetcalf.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    private long id;

    // Title of game, ex: Persona 5
    private String title;

    // Description of game
    private String description;

    // Url to image of games' cover
    private String cover;
    
    // Reviewer rating, ex: 95.0
    private double rating;

    // Year game released, ex: 1995
    private int yearReleased;

    // Full release date
    private Date released;

    // Development studio
    private Developer developer;

    // Publishers that published game
    private ArrayList<Publisher> publishers;

    // Genre's of the game, ex: JRPG, Action-Adventure
    private ArrayList<Genre> genres;

    // List of Screenshots for the game
    private ArrayList<Screenshot> screenshots;

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getTitle() {
        return title;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }

    @JsonProperty
    public String getCover() {
        return cover;
    }

    @JsonProperty
    public double getRating() {
        return rating;
    }

    @JsonProperty
    public int getYearReleased() {
        return yearReleased;
    }

    @JsonProperty
    public Date getReleased() {
        return released;
    }

    @JsonProperty
    public Developer getDeveloper() {
        return developer;
    }

    @JsonProperty
    public ArrayList<Publisher> getPublishers() {
        return publishers;
    }

    @JsonProperty
    public ArrayList<Genre> getGenres() {
        return genres;
    }

    @JsonProperty
    public ArrayList<Screenshot> getScreenshots() {
        return screenshots;
    }
}