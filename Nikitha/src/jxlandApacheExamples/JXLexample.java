package jxlandApacheExamples;

import jxl.Workbook;

public class JXLexample {

public static void main(String[] args) {
	
	Workbook.getWorkbook("file path"); // to load excel files 
	Workbook.getSheet("sheet name");// to focus on particular sheet
	Sheet.getCell(Column index,row index); // to get focus on cell, index starts from zero 
	
	Workbook.createWorkbook(new File("path")); to create excel 
	Workbook.createSheet("nikitha",0);
	
	Workbook.addcell(new Label(0,0,"username"));	
	
	Sheet.getRows();// to get row count
	Sheet.getColumns(); // to get column count
	
	
	
}



}
