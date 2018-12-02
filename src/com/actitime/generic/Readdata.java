package com.actitime.generic;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fb= new FileInputStream("C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx");
new WorkbookFactory();
Workbook b= WorkbookFactory.create(fb);
//get the sheet
  Sheet sh = b.getSheet("Sheet1");
//get the row
Row r=sh.getRow(1);
//get the cell
 Cell c=r.getCell(0);

//get the data
String data= c.getStringCellValue();
System.out.println(data);
	}}

