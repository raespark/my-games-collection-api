package io.swagger.model;

import io.swagger.model.ESRB;
import io.swagger.model.Genre;
import io.swagger.model.Platform;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Game  {
  
  @ApiModelProperty(value = "")
  private Long id = null;

  @ApiModelProperty(example = "Legend of Zelda: Breath of the wild", required = true, value = "Title of the game")
 /**
   * Title of the game
  **/
  private String title = null;

  @ApiModelProperty(example = "1994", required = true, value = "Year the game was originally released")
 /**
   * Year the game was originally released
  **/
  private Integer yearReleased = null;

  @ApiModelProperty(value = "ID from internet games database")
 /**
   * ID from internet games database
  **/
  private Long igdbId = null;

  @ApiModelProperty(value = "Description of the game")
 /**
   * Description of the game
  **/
  private String description = null;

  @ApiModelProperty(value = "List of game genres the game fits into")
  @Valid
 /**
   * List of game genres the game fits into
  **/
  private List<Genre> genres = null;

  @ApiModelProperty(value = "List of platforms the game can be played on/ are owned on")
  @Valid
 /**
   * List of platforms the game can be played on/ are owned on
  **/
  private List<Platform> platforms = null;

  @ApiModelProperty(value = "")
  @Valid
  private ESRB esrb = null;

  @ApiModelProperty(value = "List of URL's pointing to the game's screenshots")
 /**
   * List of URL's pointing to the game's screenshots
  **/
  private List<String> screenshots = null;

  @ApiModelProperty(example = "1568663197086", value = "Full date of games original release represented as an int")
 /**
   * Full date of games original release represented as an int
  **/
  private Integer released = null;

  @ApiModelProperty(example = "www.nintendo.com", value = "Website for more information on the game")
 /**
   * Website for more information on the game
  **/
  private String website = null;

  @ApiModelProperty(value = "List of notes on the game made by the user")
 /**
   * List of notes on the game made by the user
  **/
  private List<String> notes = null;

  @ApiModelProperty(value = "Indicates weather user has played this game or not")
 /**
   * Indicates weather user has played this game or not
  **/
  private Boolean played = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Game id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Title of the game
   * @return title
  **/
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Game title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Year the game was originally released
   * @return yearReleased
  **/
  @JsonProperty("yearReleased")
  @NotNull
  public Integer getYearReleased() {
    return yearReleased;
  }

  public void setYearReleased(Integer yearReleased) {
    this.yearReleased = yearReleased;
  }

  public Game yearReleased(Integer yearReleased) {
    this.yearReleased = yearReleased;
    return this;
  }

 /**
   * ID from internet games database
   * @return igdbId
  **/
  @JsonProperty("igdbId")
  public Long getIgdbId() {
    return igdbId;
  }

  public void setIgdbId(Long igdbId) {
    this.igdbId = igdbId;
  }

  public Game igdbId(Long igdbId) {
    this.igdbId = igdbId;
    return this;
  }

 /**
   * Description of the game
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Game description(String description) {
    this.description = description;
    return this;
  }

 /**
   * List of game genres the game fits into
   * @return genres
  **/
  @JsonProperty("genres")
  public List<Genre> getGenres() {
    return genres;
  }

  public void setGenres(List<Genre> genres) {
    this.genres = genres;
  }

  public Game genres(List<Genre> genres) {
    this.genres = genres;
    return this;
  }

  public Game addGenresItem(Genre genresItem) {
    this.genres.add(genresItem);
    return this;
  }

 /**
   * List of platforms the game can be played on/ are owned on
   * @return platforms
  **/
  @JsonProperty("platforms")
  public List<Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<Platform> platforms) {
    this.platforms = platforms;
  }

  public Game platforms(List<Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public Game addPlatformsItem(Platform platformsItem) {
    this.platforms.add(platformsItem);
    return this;
  }

 /**
   * Get esrb
   * @return esrb
  **/
  @JsonProperty("esrb")
  public ESRB getEsrb() {
    return esrb;
  }

  public void setEsrb(ESRB esrb) {
    this.esrb = esrb;
  }

  public Game esrb(ESRB esrb) {
    this.esrb = esrb;
    return this;
  }

 /**
   * List of URL&#39;s pointing to the game&#39;s screenshots
   * @return screenshots
  **/
  @JsonProperty("screenshots")
  public List<String> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<String> screenshots) {
    this.screenshots = screenshots;
  }

  public Game screenshots(List<String> screenshots) {
    this.screenshots = screenshots;
    return this;
  }

  public Game addScreenshotsItem(String screenshotsItem) {
    this.screenshots.add(screenshotsItem);
    return this;
  }

 /**
   * Full date of games original release represented as an int
   * @return released
  **/
  @JsonProperty("released")
  public Integer getReleased() {
    return released;
  }

  public void setReleased(Integer released) {
    this.released = released;
  }

  public Game released(Integer released) {
    this.released = released;
    return this;
  }

 /**
   * Website for more information on the game
   * @return website
  **/
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Game website(String website) {
    this.website = website;
    return this;
  }

 /**
   * List of notes on the game made by the user
   * @return notes
  **/
  @JsonProperty("notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Game notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Game addNotesItem(String notesItem) {
    this.notes.add(notesItem);
    return this;
  }

 /**
   * Indicates weather user has played this game or not
   * @return played
  **/
  @JsonProperty("played")
  public Boolean isPlayed() {
    return played;
  }

  public void setPlayed(Boolean played) {
    this.played = played;
  }

  public Game played(Boolean played) {
    this.played = played;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    yearReleased: ").append(toIndentedString(yearReleased)).append("\n");
    sb.append("    igdbId: ").append(toIndentedString(igdbId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    esrb: ").append(toIndentedString(esrb)).append("\n");
    sb.append("    screenshots: ").append(toIndentedString(screenshots)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

