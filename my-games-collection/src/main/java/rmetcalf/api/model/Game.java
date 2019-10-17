package rmetcalf.api.model;

public class Game  {
  
  private Long id;

 /**
   * Title of the game
  **/
  private String title;

 /**
   * Year the game was originally released
  **/
  private Integer yearReleased = null;

 /**
   * ID from internet games database
  **/
  private Long igdbId = null;

 /**
   * Description of the game
  **/
  private String description = null;

  @Valid
 /**
   * List of game genres the game fits into
  **/
  private java.util.List<Genre> genres = null;

  @Valid
 /**
   * List of platforms the game can be played on/ are owned on
  **/
  private java.util.List<Platform> platforms = null;

  @Valid
  private ESRB esrb = null;

 /**
   * List of URL's pointing to the game's screenshots
  **/
  private java.util.List<String> screenshots = null;

 /**
   * Full date of games original release represented as an int
  **/
  private Integer released = null;

 /**
   * Website for more information on the game
  **/
  private String website = null;

 /**
   * List of notes on the game made by the user
  **/
  private java.util.List<String> notes = null;

 /**
   * Indicates weather user has played this game or not
  **/
  private Boolean played = null;

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

