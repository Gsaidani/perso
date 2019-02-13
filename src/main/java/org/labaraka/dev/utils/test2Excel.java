package org.labaraka.dev.utils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.labaraka.dev.entities.Employe;

import com.mysql.cj.result.Row;

public class test2Excel  {
	
	    private static String[] columns = {"Name", "Email", "Date Of Birth", "Salary"};
	    private static List<Employe> employees = null;

		// Initializing employees data to insert into the excel file
	   
	        Calendar dateOfBirth = Calendar.getInstance();
	        //dateOfBirth.set(1992, 7, 21);
	        Employe e =new Employe("nom", "prenom", 1000);
	        Employe e2 =new Employe("nom2", "prenom2", 2000);

	        //employees.add();
	        //employees.add(e);
	       
	        	Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

		        /* CreationHelper helps us create instances of various things like DataFormat, 
		           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
		        CreationHelper createHelper = workbook.getCreationHelper();

		        // Create a Sheet
		        Sheet sheet = workbook.createSheet("Employee");

		        // Create a Font for styling header cells
		        Font headerFont = workbook.createFont();
		        //headerFont.setBold(true);
		        //headerFont.setFontHeightInPoints((short) 14);
		        //headerFont.setColor(IndexedColors.RED.getIndex());

		        // Create a CellStyle with the font
		        CellStyle headerCellStyle = workbook.createCellStyle();
		        //headerCellStyle.setFont(headerFont);

		        // Create a Row
		        org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(0);

		        // Create cells
		        for(int i = 0; i < columns.length; i++) {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		            cell.setCellStyle(headerCellStyle);
		        }

		        // Create Cell Style for formatting Date
		        CellStyle dateCellStyle = workbook.createCellStyle();
		        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		        // Create Other rows and cells with employees data
		        int rowNum = 1;
		        for(Employe employee: employees) {
		            org.apache.poi.ss.usermodel.Row row = sheet.createRow(rowNum++);

		            row.createCell(0)
		                    .setCellValue(employee.getNom());

		            row.createCell(1)
		                    .setCellValue(employee.getPrenom());

		            row.createCell(3)
		                    .setCellValue(employee.getSalary());
		        }

				// Resize all columns to fit the content size
		        for(int i = 0; i < columns.length; i++) {
		            sheet.autoSizeColumn(i);
		        }

		        // Write the output to a file
		        FileOutputStream fileOut = new FileOutputStream("test.xlsx");
		        workbook.write(fileOut);
		        fileOut.close();

		        // Closing the workbook
		        workbook.close(); 
	

}
}
