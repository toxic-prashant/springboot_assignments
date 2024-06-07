package com.excel.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CircuitData {

  @JsonProperty("customerGSTNumber")
  private String customerGSTNumber;

  @JsonProperty("billToAddress")
  private String billToAddress;

  @JsonProperty("shipToAddress")
  private String shipToAddress;

  @JsonProperty("enterpriseCode")
  private String enterpriseCode;

  @JsonProperty("circuitStatus")
  private String circuitStatus;

  @JsonProperty("ActivationDate")
  private String ActivationDate;

  @JsonProperty("enterpriseName")
  private String enterpriseName;

  @JsonProperty("circuitId")
  private String circuitId;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("productType")
  private String productType;

  @JsonProperty("deliveredAtCircle")
  private String deliveredAtCircle;

  public String getCustomerGSTNumber() {
    return customerGSTNumber;
  }

  public void setCustomerGSTNumber(String customerGSTNumber) {
    this.customerGSTNumber = customerGSTNumber;
  }

  public String getBillToAddress() {
    return billToAddress;
  }

  public void setBillToAddress(String billToAddress) {
    this.billToAddress = billToAddress;
  }

  public String getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public String getEnterpriseCode() {
    return enterpriseCode;
  }

  public void setEnterpriseCode(String enterpriseCode) {
    this.enterpriseCode = enterpriseCode;
  }

  public String getCircuitStatus() {
    return circuitStatus;
  }

  public void setCircuitStatus(String circuitStatus) {
    this.circuitStatus = circuitStatus;
  }

  public String getActivationDate() {
    return ActivationDate;
  }

  public void setActivationDate(String activationDate) {
    ActivationDate = activationDate;
  }

  public String getCircuitId() {
    return circuitId;
  }

  public void setCircuitId(String circuitId) {
    this.circuitId = circuitId;
  }

  public String getEnterpriseName() {
    return enterpriseName;
  }

  public void setEnterpriseName(String enterpriseName) {
    this.enterpriseName = enterpriseName;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getDeliveredAtCircle() {
    return deliveredAtCircle;
  }

  public void setDeliveredAtCircle(String deliveredAtCircle) {
    this.deliveredAtCircle = deliveredAtCircle;
  }
}
