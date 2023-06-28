/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.dto;

import java.util.List;

public class InvoiceDTOBuilder {
  private String invoiceId;
  private List<LineDTO> lines;
  public InvoiceDTO createInvoiceDTO() {
    return new InvoiceDTO(invoiceId, lines);
  }
  public InvoiceDTOBuilder setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }
  public InvoiceDTOBuilder setLines(List<LineDTO> lines) {
    this.lines = lines;
    return this;
  }
}