/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public class ConsolidateResponseDTO {
  private String status;

  private List<InvoiceDTO> invoices;
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public List<InvoiceDTO> getInvoices() {
    return invoices;
  }
  public void setInvoices(List<InvoiceDTO> invoices) {
    this.invoices = invoices;
  }
}
