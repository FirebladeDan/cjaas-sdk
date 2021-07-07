/*
 * Azure Functions OpenAPI Extension
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
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
import io.swagger.client.model.ErrorObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * HttpErrorResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-06T08:57:46.449-05:00[America/Chicago]")
public class HttpErrorResponse {
  @SerializedName("error")
  private ErrorObject error = null;

  @SerializedName("trackingId")
  private String trackingId = null;

  public HttpErrorResponse error(ErrorObject error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public ErrorObject getError() {
    return error;
  }

  public void setError(ErrorObject error) {
    this.error = error;
  }

  public HttpErrorResponse trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @Schema(description = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpErrorResponse httpErrorResponse = (HttpErrorResponse) o;
    return Objects.equals(this.error, httpErrorResponse.error) &&
        Objects.equals(this.trackingId, httpErrorResponse.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, trackingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpErrorResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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
