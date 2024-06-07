package com.excel.util;

import com.excel.model.CircuitData;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

  private static final String[] COLUMN_HEADERS = {"customerGSTNumber", "billToAddress",
      "shipToAddress", "enterpriseCode", "circuitStatus", "activationDate", "enterpriseName",
      "circuitId", "productName", "productType", "deliveredAtCircle", "timestamp"};

  public static void writeDataToExcel(CircuitData data) {
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Circuit Data");

    Row headerRow = sheet.createRow(0);
    for (int i = 0; i < COLUMN_HEADERS.length; i++) {
      Cell cell = headerRow.createCell(i);
      cell.setCellValue(COLUMN_HEADERS[i]);
    }

    Row dataRow = sheet.createRow(1);
    dataRow.createCell(0).setCellValue(data.getCustomerGSTNumber());
    dataRow.createCell(1).setCellValue(data.getBillToAddress());
    dataRow.createCell(2).setCellValue(data.getShipToAddress());
    dataRow.createCell(3).setCellValue(data.getEnterpriseCode());
    dataRow.createCell(4).setCellValue(data.getCircuitStatus());
    dataRow.createCell(5).setCellValue(data.getActivationDate());
    dataRow.createCell(6).setCellValue(data.getEnterpriseName());
    dataRow.createCell(7).setCellValue(data.getCircuitId());
    dataRow.createCell(8).setCellValue(data.getProductName());
    dataRow.createCell(9).setCellValue(data.getProductType());
    dataRow.createCell(10).setCellValue(data.getDeliveredAtCircle());

    String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    dataRow.createCell(11).setCellValue(timeStamp);

    try(FileOutputStream fileOut = new FileOutputStream("CircuitData.xlsx")){
      workbook.write(fileOut);
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        workbook.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }



  }
}
