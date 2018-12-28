package org.dev.jklabour.adminCommonLibs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AFileUtiles {
	
	static Workbook wbook;
	static Sheet sheet;
	
	  public static Properties getpropertyData() throws Throwable
	  {
		 FileInputStream fis=new FileInputStream("./propertyFiles/common.properties");
		 Properties pobj =new  Properties();
		 pobj.load(fis);
		return pobj;
	  }
	  
 /*------------------------create constructor------------------------*/	  
	  
	
	  
	  
 
	  public AFileUtiles(String path,String sheet2) {
		  try{
			   FileInputStream fis=new FileInputStream(path);
			   new WorkbookFactory();
			 wbook=WorkbookFactory.create(fis); 
		      sheet=wbook.getSheet(sheet2);
			  }
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
	  public  double getIntExcelData(int rownum,int celnum ) 
			  throws EncryptedDocumentException, Throwable{
		   
		  Row row =sheet.getRow(rownum);
		  Cell cell=row.getCell(celnum);
		  double data=cell.getNumericCellValue();
		  wbook.close();
		return data;	    
		  
	  }
	  
	/*------------------------------------*/
	  
	  public  void setExcelData( String path,int rownum, int colnum, String data) throws Throwable, IOException
	  {
		 
		   Row rown=sheet.createRow(rownum);
		   Cell cl=rown.createCell(colnum);
		   cl.setCellValue(data);
		   FileOutputStream fos=new FileOutputStream(path);
		  wbook.write(fos);
		  wbook.close();   
	  }
	  
	  
	  
	  
	  /*----------------double to string convert ---------------------*/
	  
	  public String convertDoubleToString(double d)
	  {
		  int i=(int) d;
		  String data= String.valueOf(i);
		  
		  return data;
	  }
	  
	
	}
	  
	  

