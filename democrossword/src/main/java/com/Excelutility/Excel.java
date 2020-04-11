package com.Excelutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	// To read and return username
	public String Excel_username(int a) throws IOException {

		FileInputStream fil = new FileInputStream(new File("C:\\Users\\DELL\\Documents\\demoexcel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(a);   // this the row we will pass  the code
		XSSFCell cell = row.getCell(0);  // getting value from same cell 
		                                 // pass the username col no 
		String un = cell.getStringCellValue();

		return un;
	}

	// TO read and return password
	public String Excel_password(int b) throws IOException {

		FileInputStream fil = new FileInputStream(new File("C:\\Users\\DELL\\Documents\\demoexcel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(b);      // the we will pass where we are clling
		XSSFCell cell = row.getCell(1);    // your getting value from same cell
		                                   // give the password col value
		String pwd = cell.getStringCellValue();

		return pwd;
	}
}
