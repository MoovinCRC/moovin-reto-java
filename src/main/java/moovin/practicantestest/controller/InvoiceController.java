/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.controller;

import moovin.practicantestest.dto.ConsolidateResponseDTO;
import moovin.practicantestest.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("invoice")
public class InvoiceController {
  private final InvoiceService invoiceService;

  @Autowired
  public InvoiceController(InvoiceService invoiceService) {
    this.invoiceService = invoiceService;
  }

  @PostMapping("/consolidate-lines")
  public Mono<ResponseEntity<ConsolidateResponseDTO>> consolidateInvoice(Object lines) {
    HttpStatus httpStatus = HttpStatus.OK;
    ConsolidateResponseDTO consolidateResponseDTO = new ConsolidateResponseDTO();
    /* TODO: implementar el método para agrupar las líneas
    List<InvoiceDTO> result = invoiceService.groupLines(lines);
    */
    /* TODO: Agregar códigos de estado (httpStatus) correspondientes al tipo de respuesta */
    return Mono.just(new ResponseEntity<>(consolidateResponseDTO, httpStatus));
  }
}
