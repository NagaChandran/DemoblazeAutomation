package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadInputfromExcel {

	public static Object[][] ReadvaluesfromExcel(String ExcelPath, String Sheetname) throws IOException {
		 XSSFWorkbook workbook = new XSSFWorkbook(ExcelPath);
	     XSSFSheet sheet = workbook.getSheet(Sheetname);
	     
	     if (sheet == null) {
             System.out.println("Sheet not found!");
	     }
	     
	     //Row count
	     int rowcount = sheet.getLastRowNum();

	     //Column count
	     XSSFRow row = sheet.getRow(0);
	     int colCount = row.getLastCellNum();

	     Object[][] obj = new Object[rowcount][colCount];
	     for (int i=1;i<=rowcount;i++) {
	    	 XSSFRow myrow = sheet.getRow(i);
	    	 for (int j = 0; j < colCount; j++) {
	    		//System.out.println(myrow.getCell(j).getStringCellValue());
	    		 if(myrow.getCell(j)==null) {
						obj[i-1][j]="";
					}
					else {
						obj[i-1][j]=myrow.getCell(j).getStringCellValue();	
					}
	    	 }
	     }
	     
	     workbook.close();
	     return obj;
	}
}
