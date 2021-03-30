package com.automation.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file= new FileInputStream("./testdata/testdata.xlsx");
		XSSFWorkbook wbook= new XSSFWorkbook(file);
		XSSFSheet sheet= wbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		XSSFRow row= sheet.getRow(0);
		int colcount=row.getLastCellNum();
		//DataFormatter format= new DataFormatter();
		//Object data[][]= new Object[rowcount-1][colcount];
		for(int i=0;i<rowcount-1;i++)
		{
			
			row=sheet.getRow(i+1);
			for(int j=0;j<colcount;j++)
			{
				XSSFCell cell=row.getCell(j);
				//data[i][j]=format.formatCellValue(cell);
				System.out.print(cell+" ");
				
			}
		}
		
		wbook.close();
		
	}


}


