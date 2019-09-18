package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Game;
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

/**
  * Object representing User data
 **/
@ApiModel(description="Object representing User data")
public class User  {
  
  @ApiModelProperty(value = "Local ID")
 /**
   * Local ID
  **/
  private Long id = null;

  @ApiModelProperty(example = "Raespark", required = true, value = "name unique to that user")
 /**
   * name unique to that user
  **/
  private String username = null;

  @ApiModelProperty(example = "example@mail.com", required = true, value = "Email owned by user.")
 /**
   * Email owned by user.
  **/
  private String email = null;

  @ApiModelProperty(value = "Password for the User")
 /**
   * Password for the User
  **/
  private String password = null;

  @ApiModelProperty(value = "List of games owned by the user")
  @Valid
 /**
   * List of games owned by the user
  **/
  private List<Game> games = null;
 /**
   * Local ID
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * name unique to that user
   * @return username
  **/
  @JsonProperty("username")
  @NotNull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Email owned by user.
   * @return email
  **/
  @JsonProperty("email")
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

 /**
   * Password for the User
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

 /**
   * List of games owned by the user
   * @return games
  **/
  @JsonProperty("games")
  public List<Game> getGames() {
    return games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }

  public User games(List<Game> games) {
    this.games = games;
    return this;
  }

  public User addGamesItem(Game gamesItem) {
    this.games.add(gamesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
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

