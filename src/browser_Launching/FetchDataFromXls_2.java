package browser_Launching;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;//import class Sheet from apache.poi.ss.usermodel pckg
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchDataFromXls_2 
{

	public static void main(String[] args)throws EncryptedDocumentException,IOException 
	{
       String path="C:\\Users\\Prasad\\Documents\\parameterization.xlsx";
       FileInputStream file=new FileInputStream(path);
       
      // String value=WorkbookFactory.create(file).getSheet("velocity").getRow().getcell().getStringCellValue();
       
          Sheet val = WorkbookFactory.create(file).getSheet("velocity");//this will fix(return Class Sheet by method getSheet so retuntype will be Sheet)
       
    
       
     //TO FETCH DATA FROM all row and cell(col)XL-SHEET
      for(int i=0;i<5;i++)  //outer loop for row
       {
     	 for(int j=0;j<2;j++) //inner loop for cell/col 
     	 {
     		 String st=val.getRow(i).getCell(j).getStringCellValue();//changing val row n cell
     		 //return value string by getStringCellValue() so returntype is string 
     		 //method call with ref of Sheet val
     		 
     		 System.out.println(st);
     	 
     	 }
     	}
       
        /*
         * 
         */

       
        
        
        
        
       }
}


