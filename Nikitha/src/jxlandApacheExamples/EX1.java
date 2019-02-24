package jxlandApacheExamples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EX1 {
	
	// how to create xls file
	
	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb= new XSSFWorkbook();
		
FileOutputStream fileout = new FileOutputStream("D:\\Selenium Naveen\\nikithaxlfile.xlsx");
		
wb.write(fileout);
fileout.close();
		
// xlsx came into market in 2007, Apache POI supports both xls and xlsx
// 97-2003 -"xls"



	}
}
