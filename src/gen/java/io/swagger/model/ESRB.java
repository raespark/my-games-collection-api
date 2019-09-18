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
  * ESRB age rating for the game
 **/
@ApiModel(description="ESRB age rating for the game")
public class ESRB  {
  
  @ApiModelProperty(value = "")
  private Long id = null;

  @ApiModelProperty(value = "ID from internet games database")
 /**
   * ID from internet games database
  **/
  private Long igdbId = null;

  @ApiModelProperty(example = "https://www.esrb.org/wp-content/uploads/2019/05/E.svg", value = "Url for the rating image")
 /**
   * Url for the rating image
  **/
  private String image = null;


@XmlType(name="RatingEnum")
@XmlEnum(String.class)
public enum RatingEnum {

@XmlEnumValue("E") E(String.valueOf("E")), @XmlEnumValue("E10+") E10_(String.valueOf("E10+")), @XmlEnumValue("T") T(String.valueOf("T")), @XmlEnumValue("M") M(String.valueOf("M")), @XmlEnumValue("AO") AO(String.valueOf("AO")), @XmlEnumValue("RP") RP(String.valueOf("RP"));


    private String value;

    RatingEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RatingEnum fromValue(String v) {
        for (RatingEnum b : RatingEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "age rating for this game")
 /**
   * age rating for this game
  **/
  private RatingEnum rating = null;
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

  public ESRB id(Long id) {
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

  public ESRB igdbId(Long igdbId) {
    this.igdbId = igdbId;
    return this;
  }

 /**
   * Url for the rating image
   * @return image
  **/
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ESRB image(String image) {
    this.image = image;
    return this;
  }

 /**
   * age rating for this game
   * @return rating
  **/
  @JsonProperty("rating")
  public String getRating() {
    if (rating == null) {
      return null;
    }
    return rating.value();
  }

  public void setRating(RatingEnum rating) {
    this.rating = rating;
  }

  public ESRB rating(RatingEnum rating) {
    this.rating = rating;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESRB {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    igdbId: ").append(toIndentedString(igdbId)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

