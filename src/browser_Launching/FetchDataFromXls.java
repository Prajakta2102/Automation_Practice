    package browser_Launching;

import java.io.FileInputStream;//importing  class FileInputStream from  pckg java.io
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;//importing class WorkbookFactory from pckg apache.poi.ss.usermodel
public class FetchDataFromXls 
{
   public static void main(String[] args)throws IOException
	
   {
      String path="C:\\Users\\Prasad\\Documents\\parameterization.xlsx";//stored path of xl sheet in variable so we cn use.//like dest in screenshot we used
     
      FileInputStream file=new FileInputStream(path);
     
      //TO FETCH DATA FROM specific row and cell(col)XL-SHEET
      String value= WorkbookFactory.create(file).getSheet("velocity").getRow(2).getCell(1).getStringCellValue();//to read string data //method chaining
      System.out.println(value);//pass 2
      
      
      
      
       
  
      
      
      
     
      
      
      
      
      
      /*  double value1= WorkbookFactory.create(file).getSheet("velocity").getRow(4).getCell(1).getNumericCellValue();//to read numeric data (type)//method chaining
      System.out.println(value1);*/
     
      /*PARAMETERISATION:- reading data from external file.
       * HOW TO FETCH DATA FROM XL-SHEET?
       * 1.Create obj of FileInputStream
       *2.FileInputStream is class which is used to take any outside i/p file into the java memory
       *3.pass arg as path in obj 
       *4.so ,define a path in java memory n nw java memory will read data n hv xl sheet(copy) n data also
       *5.to read data,WorkbookFactory(Class)-->apche.poi.ss.usermodel.WorkbookFcatory
       *6.create()-->static method of WorkbookFcatory class-->arg -->File file
       *7.getsheet()-->method(a) of WorkbookFcatory class-->arg-->string--return-->sheet- calling method wid ref of create method
       *8.getRow()-->method(a) of sheet class-->arg-->int--return-->Row-calling method wid ref of sheet method
      
       *9.getCell()-->method(a) of Row class-->arg-->int--return-->Cell -calling method wid ref of row method
       *10.getStringCellValue()-->abstract method of Cell class-->arg-->no arg--return-->string -calling method wid ref of cell method 
       *11.println-->to read the data from
       *12.illegalstateexception-->when you read data int(numeric)/string(string ) type of data so
       *getStringCellValue()-to read string type data->Method Cell(C)
       *getNumericCellValue()-to read numeric type data-->return-->double->Method Cell(C)   */
      
      
	
   }

}
