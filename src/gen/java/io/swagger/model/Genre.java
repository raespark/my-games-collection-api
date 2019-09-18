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
  * Video game genre
 **/
@ApiModel(description="Video game genre")
public class Genre  {
  
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

  @ApiModelProperty(example = "Action/Adventure", required = true, value = "Name of gaming genre")
 /**
   * Name of gaming genre
  **/
  private String name = null;
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

  public Genre id(Long id) {
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

  public Genre igdbId(Long igdbId) {
    this.igdbId = igdbId;
    return this;
  }

 /**
   * Name of gaming genre
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

  public Genre name(String name) {
    this.name = name;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Genre {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    igdbId: ").append(toIndentedString(igdbId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

