package jxlandApacheExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream excelfiletoread= new FileInputStream("D:\\Selenium Naveen\\naveen.xls");
		XSSFWorkbook wb = new XSSFWorkbook(excelfiletoread);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell ;
		Iterator<Row> rows= sheet.rowIterator();
			
		while (rows.hasNext()){
			
			row=(XSSFRow) rows.next();
			
			Iterator<Cell> cells= row.cellIterator();
			while (cells.hasNext()){
			cell= (XSSFCell) cells.next();
			System.out.println(cell.getStringCellValue()+" ");
			
		
			}
			
		}
					
	}

}
