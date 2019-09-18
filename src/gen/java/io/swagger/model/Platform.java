package io.swagger.model;

import io.swagger.annotations.ApiModel;
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
  * Platform on which game can be played
 **/
@ApiModel(description="Platform on which game can be played")
public class Platform  {
  
  @ApiModelProperty(value = "Local ID")
 /**
   * Local ID
  **/
  private Long id = null;

  @ApiModelProperty(value = "ID from internet games database")
 /**
   * ID from internet games database
  **/
  private Long igdbId = null;

  @ApiModelProperty(example = "Steam", required = true, value = "Name of gaming platform")
 /**
   * Name of gaming platform
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "URL to platform logo")
 /**
   * URL to platform logo
  **/
  private String logo = null;
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

  public Platform id(Long id) {
    this.id = id;
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

  public Platform igdbId(Long igdbId) {
    this.igdbId = igdbId;
    return this;
  }

 /**
   * Name of gaming platform
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Platform name(String name) {
    this.name = name;
    return this;
  }

 /**
   * URL to platform logo
   * @return logo
  **/
  @JsonProperty("logo")
  @NotNull
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Platform logo(String logo) {
    this.logo = logo;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    igdbId: ").append(toIndentedString(igdbId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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

