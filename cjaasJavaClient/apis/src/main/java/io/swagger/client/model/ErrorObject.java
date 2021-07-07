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
import io.swagger.client.model.MessageObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ErrorObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-06T08:57:46.449-05:00[America/Chicago]")
public class ErrorObject {
  @SerializedName("key")
  private Integer key = null;

  @SerializedName("message")
  private List<MessageObject> message = null;

  public ErrorObject key(Integer key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public Integer getKey() {
    return key;
  }

  public void setKey(Integer key) {
    this.key = key;
  }

  public ErrorObject message(List<MessageObject> message) {
    this.message = message;
    return this;
  }

  public ErrorObject addMessageItem(MessageObject messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<MessageObject>();
    }
    this.message.add(messageItem);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public List<MessageObject> getMessage() {
    return message;
  }

  public void setMessage(List<MessageObject> message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorObject errorObject = (ErrorObject) o;
    return Objects.equals(this.key, errorObject.key) &&
        Objects.equals(this.message, errorObject.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorObject {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
