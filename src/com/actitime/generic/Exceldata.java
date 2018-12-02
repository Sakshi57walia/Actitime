package com.actitime.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {
	public static String getData(String Filepath, String sheetname, int rn, int cn) {
		try {
			FileInputStream fb = new FileInputStream("C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx");
			Cell c = WorkbookFactory.create(fb).getSheet(sheetname).getRow(rn).getCell(cn);
			String data = c.getStringCellValue();
			return data;

		} catch (Exception e) {
			return "";
		}
	}
}
