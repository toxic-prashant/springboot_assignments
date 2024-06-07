package com.excel.controller;

import com.excel.model.CircuitData;
import com.excel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CircuitController {
  @Autowired
  private ExcelService excelService;

  @PostMapping("/saveCircuitData")
  public String saveCircuitData(@RequestBody CircuitData circuitData) {
    excelService.saveToExcel(circuitData);
    return "Data saved successfully!";
  }
}
