/*
 * Easy!Appointments API
 * These are the OpenAPI specs that describe the REST API of Easy!Appointments.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@easyappointments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ServicePayload
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-12-06T17:26:30.696Z[GMT]")
public class ServicePayload {
  @SerializedName("name")
  private String name = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("price")
  private BigDecimal price = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("availabilitiesType")
  private String availabilitiesType = null;

  @SerializedName("attendantsNumber")
  private Integer attendantsNumber = null;

  @SerializedName("categoryId")
  private Integer categoryId = null;

  public ServicePayload name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServicePayload duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @Schema(description = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ServicePayload price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public ServicePayload currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ServicePayload location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ServicePayload description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServicePayload availabilitiesType(String availabilitiesType) {
    this.availabilitiesType = availabilitiesType;
    return this;
  }

   /**
   * Get availabilitiesType
   * @return availabilitiesType
  **/
  @Schema(description = "")
  public String getAvailabilitiesType() {
    return availabilitiesType;
  }

  public void setAvailabilitiesType(String availabilitiesType) {
    this.availabilitiesType = availabilitiesType;
  }

  public ServicePayload attendantsNumber(Integer attendantsNumber) {
    this.attendantsNumber = attendantsNumber;
    return this;
  }

   /**
   * Get attendantsNumber
   * @return attendantsNumber
  **/
  @Schema(description = "")
  public Integer getAttendantsNumber() {
    return attendantsNumber;
  }

  public void setAttendantsNumber(Integer attendantsNumber) {
    this.attendantsNumber = attendantsNumber;
  }

  public ServicePayload categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @Schema(description = "")
  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePayload servicePayload = (ServicePayload) o;
    return Objects.equals(this.name, servicePayload.name) &&
        Objects.equals(this.duration, servicePayload.duration) &&
        Objects.equals(this.price, servicePayload.price) &&
        Objects.equals(this.currency, servicePayload.currency) &&
        Objects.equals(this.location, servicePayload.location) &&
        Objects.equals(this.description, servicePayload.description) &&
        Objects.equals(this.availabilitiesType, servicePayload.availabilitiesType) &&
        Objects.equals(this.attendantsNumber, servicePayload.attendantsNumber) &&
        Objects.equals(this.categoryId, servicePayload.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, duration, price, currency, location, description, availabilitiesType, attendantsNumber, categoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePayload {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    availabilitiesType: ").append(toIndentedString(availabilitiesType)).append("\n");
    sb.append("    attendantsNumber: ").append(toIndentedString(attendantsNumber)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
