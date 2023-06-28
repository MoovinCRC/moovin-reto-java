/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.List;

@JsonSerialize
public class InvoiceDTO {

  @JsonProperty("invoice_id")
  private String invoiceId;
  @JsonProperty("lines")
  private List<LineDTO> lines;
  public InvoiceDTO() {
    lines = new ArrayList<>();
  }

  public InvoiceDTO(String invoiceId, List<LineDTO> lines) {
    this.invoiceId = invoiceId;
    this.lines = lines;
  }
  public String getInvoiceId() {
    return invoiceId;
  }
  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }
  public List<LineDTO> getLines() {
    return lines;
  }
  public void setLines(List<LineDTO> lines) {
    this.lines = lines;
  }
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("InvoiceDTO{");
    sb.append("invoiceId='").append(invoiceId).append('\'');
    sb.append(", lines=").append(lines);
    sb.append('}');
    return sb.toString();
  }
}
