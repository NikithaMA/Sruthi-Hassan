package jxlandApacheExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example2 {
	
	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb= new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("nikitha");
		
		int row =0;
		int column=0;
		
	 Row r1=sheet.createRow(row);
		r1.createCell(column).setCellValue("ma");
		column++;
		r1.createCell(column).setCellValue("Tirpuathi");
FileOutputStream fp = new FileOutputStream("D:\\Selenium Naveen\\naveen.xls");		
		
wb.write(fp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
