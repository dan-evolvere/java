/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.13.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IngressBackend describes all endpoints for a given service and port.
 */
@ApiModel(description = "IngressBackend describes all endpoints for a given service and port.")

public class V1beta1IngressBackend {
  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("servicePort")
  private IntOrString servicePort = null;

  public V1beta1IngressBackend serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Specifies the name of the referenced service.
   * @return serviceName
  **/
  @ApiModelProperty(required = true, value = "Specifies the name of the referenced service.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public V1beta1IngressBackend servicePort(IntOrString servicePort) {
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Specifies the port of the referenced service.
   * @return servicePort
  **/
  @ApiModelProperty(required = true, value = "Specifies the port of the referenced service.")
  public IntOrString getServicePort() {
    return servicePort;
  }

  public void setServicePort(IntOrString servicePort) {
    this.servicePort = servicePort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1IngressBackend v1beta1IngressBackend = (V1beta1IngressBackend) o;
    return Objects.equals(this.serviceName, v1beta1IngressBackend.serviceName) &&
        Objects.equals(this.servicePort, v1beta1IngressBackend.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, servicePort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1IngressBackend {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
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

