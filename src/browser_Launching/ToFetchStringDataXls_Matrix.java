package browser_Launching;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;//import class Sheet from apache.poi.ss.usermodel pckg
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchStringDataXls_Matrix

{
	public static void main(String[] args) throws EncryptedDocumentException ,IOException 
	{
		 String path="C:\\Users\\Prasad\\Documents\\parameterization.xlsx";  
	       FileInputStream file=new FileInputStream(path);
	       Sheet val = WorkbookFactory.create(file).getSheet("velocity"); //return value sheet so returntype sheet
	   
	       // Cell value=WorkbookFactory.create(file).getSheet("velocity").getRow(4).getCell(0);
	       //System.out.println(value);
	       
	     //TO FETCH DATA FROM all row and cell(col)XL-SHEET
	       
	        for(int i=0;i<5;i++)  //outer loop for row
	        {
	      	 for(int j=0;j<2;j++) //inner loop for cell/col 
	      	 {
	      		 Cell c=val.getRow(i).getCell(j);//call ref with sheet(val)
	      		String st=c.getStringCellValue();//return string type value
	      		 
	      		
	      		 System.out.print(st+"  ");
	      	 
	      	 }
	      	
	      	
	      	System.out.println();
	      	}
	       
	       
	       
	}

}
/*1getsheet()-->method(a) of WorkbookFcatory class-->arg-->string--return-->sheet- calling method wid ref of create method
	       *2.getRow()-->method(a) of sheet class-->arg-->int--return-->Row-calling method wid ref of sheet method
	       *3.getCell()-->method(a) of Row class-->arg-->int--return-->Cell -calling method wid ref of row method*/

