/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class LineDTO {
  @JsonProperty("id")
  private Integer id;
  @JsonProperty("serial")
  private String serial;
  @JsonProperty("product")
  private String product;
  @JsonProperty("invoice")
  private String invoice;
  @JsonProperty("quantity")
  private Integer quantity;
  @JsonProperty("unitprice")
  private Double unitPrice;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getSerial() {
    return serial;
  }
  public void setSerial(String serial) {
    this.serial = serial;
  }
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public String getInvoice() {
    return invoice;
  }
  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Double getUnitPrice() {
    return unitPrice;
  }
  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("LineDTO{");
    sb.append("id=").append(id);
    sb.append(", serial='").append(serial).append('\'');
    sb.append(", product='").append(product).append('\'');
    sb.append(", invoice='").append(invoice).append('\'');
    sb.append(", quantity=").append(quantity);
    sb.append(", unitPrice=").append(unitPrice);
    sb.append('}');
    return sb.toString();
  }
}
