package org.dev.jklabour.commonLibS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileSet {
	
	static Workbook book;
	static Sheet sheet;
	public static int i=0;
	
	  public static void setExcelData( String path,String sheet3,int rownum, int colnum, String data) throws Throwable, IOException
	  {
		  FileInputStream fis=new FileInputStream(path);
		   new WorkbookFactory();
		book=WorkbookFactory.create(fis); 
	   sheet=book.getSheet(sheet3);
		   Row rown=sheet.createRow(rownum);
		   Cell cl=rown.createCell(colnum);
		   cl.setCellValue(data);
		   FileOutputStream fos=new FileOutputStream(path);
		book.write(fos);
		book.close();   
	  }
	  
	  
	  public static Object[][] getTestData( String sheetName)
	  {
		
		  try {
  FileInputStream fis=new FileInputStream("./excel/jklabourData.xlsx");
		   
			book =WorkbookFactory.create(fis);
		
		  sheet= book.getSheet(sheetName); } 
		  
		  catch (InvalidFormatException e) 
		  {e.printStackTrace();}
		  
		  catch (IOException e) {e.printStackTrace();}
		 
		  Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		  
		  for(;i<sheet.getLastRowNum();i++)
		  {
			  for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
			  {
				 
				  data[i][j]=sheet.getRow(i).getCell(j).toString();
			  }
		  }   	   
		  return data;
		  
	
		  
	  }
	  
	  
	  
	  public static Object[][] getTestData(String path ,String sheetName)
	  {
		
		  try {
  FileInputStream fis=new FileInputStream(path);
		   
			book =WorkbookFactory.create(fis);
		
		  sheet= book.getSheet(sheetName); } 
		  
		  catch (InvalidFormatException e) 
		  {e.printStackTrace();}
		  
		  catch (IOException e) {e.printStackTrace();}
		 
		  Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		  System.out.println( "row no. --> "+sheet.getLastRowNum());
		 System.out.println(" cell no -->"+sheet.getRow(0).getLastCellNum() );
		  
		  for(int i=0;i<sheet.getLastRowNum();i++)
		  {
			  for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
			  {
				  data[i][j]=sheet.getRow(i).getCell(j).toString();
			  }
		  }   	   
		  return data;
		  
	
		  
	  }
}