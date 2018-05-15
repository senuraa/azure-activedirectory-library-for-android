/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * A SAS definition bundle consists of key vault SAS definition details plus its attributes.
 */
@ApiModel(description = "A SAS definition bundle consists of key vault SAS definition details plus its attributes.")

public class SasDefinitionBundle {
  @SerializedName("id")
  private String id = null;

  @SerializedName("sid")
  private String sid = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("attributes")
  private SasDefinitionAttributes attributes = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

   /**
   * The SAS definition id.
   * @return id
  **/
  @ApiModelProperty(value = "The SAS definition id.")
  public String getId() {
    return id;
  }

   /**
   * Storage account SAS definition secret id.
   * @return sid
  **/
  @ApiModelProperty(value = "Storage account SAS definition secret id.")
  public String getSid() {
    return sid;
  }

   /**
   * The SAS definition metadata in the form of key-value pairs.
   * @return parameters
  **/
  @ApiModelProperty(value = "The SAS definition metadata in the form of key-value pairs.")
  public Map<String, String> getParameters() {
    return parameters;
  }

   /**
   * The SAS definition attributes.
   * @return attributes
  **/
  @ApiModelProperty(value = "The SAS definition attributes.")
  public SasDefinitionAttributes getAttributes() {
    return attributes;
  }

   /**
   * Application specific metadata in the form of key-value pairs
   * @return tags
  **/
  @ApiModelProperty(value = "Application specific metadata in the form of key-value pairs")
  public Map<String, String> getTags() {
    return tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasDefinitionBundle sasDefinitionBundle = (SasDefinitionBundle) o;
    return Objects.equals(this.id, sasDefinitionBundle.id) &&
        Objects.equals(this.sid, sasDefinitionBundle.sid) &&
        Objects.equals(this.parameters, sasDefinitionBundle.parameters) &&
        Objects.equals(this.attributes, sasDefinitionBundle.attributes) &&
        Objects.equals(this.tags, sasDefinitionBundle.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sid, parameters, attributes, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasDefinitionBundle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
