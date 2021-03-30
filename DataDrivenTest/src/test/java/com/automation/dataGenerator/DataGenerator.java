package com.automation.dataGenerator;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;



public class DataGenerator {
	
	@DataProvider(name="Excel")
	public static Object[][] testDataGenerator(Method met) throws IOException
	{
		if(met.getName().equalsIgnoreCase("tc_001_login_functionality"))
			
		{
		FileInputStream file= new FileInputStream("./testdata/testdata.xlsx");
		XSSFWorkbook wbook= new XSSFWorkbook(file);
		XSSFSheet sheet= wbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int colcount=row.getLastCellNum();
		DataFormatter format= new DataFormatter();
		Object data[][]= new Object[rowcount-1][colcount];
		for(int i=0;i<rowcount-1;i++)
		{
			
			row=sheet.getRow(i+1);
			for(int j=0;j<colcount;j++)
			{
				XSSFCell cell=row.getCell(j);
				data[i][j]=format.formatCellValue(cell);
			}
		}
		wbook.close();
		return data;
	
} else if(met.getName().equalsIgnoreCase("tc_002_create_account"))

	{
		FileInputStream file= new FileInputStream("./testdata/testdata.xlsx");
		XSSFWorkbook wbook= new XSSFWorkbook(file);
		XSSFSheet sheet= wbook.getSheet("c_acct");
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int colcount=row.getLastCellNum();
		DataFormatter format= new DataFormatter();
		Object data[][]= new Object[rowcount-1][colcount];
		for(int i=0;i<rowcount-1;i++)
		{
			
			row=sheet.getRow(i+1);
			for(int j=0;j<colcount;j++)
			{
				XSSFCell cell=row.getCell(j);
				data[i][j]=format.formatCellValue(cell);
			}
		}
		wbook.close();
		return data;
		 
}else 
{
	Object[][] data= new Object[2][3];
	return data;
}
		
}
}
