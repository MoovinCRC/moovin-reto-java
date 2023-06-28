/******************************************************************************
 * Alvaro Araya O. coder@aao.cr aaocr +506 8899 8899                          *
 * Copyright (c) 2023.                                                        *
 ******************************************************************************/

package moovin.practicantestest.service;

import moovin.practicantestest.dto.InvoiceDTO;
import moovin.practicantestest.dto.LineDTO;

import java.util.List;

public interface InvoiceService {
  List<InvoiceDTO> groupLines(List<LineDTO> lines);
}
