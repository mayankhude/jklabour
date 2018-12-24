package org.dev.jklabour.commonLibS;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtiles {
	
	static Workbook wbook;
	static Sheet sheet;
	public static int cel1;
	public static int row1;
	  public static Properties getpropertyData() throws Throwable
	  {
		 FileInputStream fis=new FileInputStream("./propertyFiles/common.properties");
		 Properties pobj =new  Properties();
		 pobj.load(fis);
		return pobj;
	  }
	  
 /*------------------------create constructor------------------------*/	  
	  
	
	  
	  
 
	  public FileUtiles(String path,String sheet2) {
		  try{
			   FileInputStream fis=new FileInputStream(path);
			   new WorkbookFactory();
			 wbook=WorkbookFactory.create(fis); 
		      sheet=wbook.getSheet(sheet2);
		      wbook.close();}
			  catch (Exception e) {
				e.printStackTrace();}
		// TODO Auto-generated constructor stub
	}
	
	  
	  
	  /*-------------------Take data from excel sheet---------------------------*/
	  

	public  String getStringExcelData(int rownum,int celnum ) 
			  throws EncryptedDocumentException, Throwable{
		  Row row =sheet.getRow(rownum);
		  Cell cell=row.getCell(celnum); 
		  String data=cell.getStringCellValue();
		  wbook.close();
		return data;	    
		  
	  }
	  
	/*-----------------------------*/
	  public double getIntExcelData(int rownum,int celnum ) 
			  throws EncryptedDocumentException, Throwable{
		   
		  Row row =sheet.getRow(rownum);
		  Cell cell=row.getCell(celnum);
		  double data=cell.getNumericCellValue();
		  wbook.close();
		return data;	    
		  
	  }
	  
	/*------------------------------------*/
	  
	
	  
	  
	  
	  /*----------------double to string convert ---------------------*/
	  
	  public String convertDoubleToString(double d)
	  {
		  int i=(int) d;
		  String data= String.valueOf(i);
		  
		  return data;
	  }
	  
	
	}
	  
	  

