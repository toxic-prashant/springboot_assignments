package com.excel.service;

import com.excel.model.CircuitData;
import com.excel.util.ExcelUtil;
import org.springframework.stereotype.Service;

@Service
public class ExcelService {

  public void saveToExcel(CircuitData circuitData) {
    ExcelUtil.writeDataToExcel(circuitData);
  }
}
