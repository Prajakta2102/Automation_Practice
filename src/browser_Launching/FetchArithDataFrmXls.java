package browser_Launching;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
public class FetchArithDataFrmXls 
{
	 static int i;
	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\Prasad\\Desktop\\result.xlsx";
		FileInputStream f=new FileInputStream(path);
	   
		//String user_id=WorkbookFactory.create(f).getSheet("arithmatic").getRow(3).getCell(1).getStringCellValue();//method of cell-->getStringCellValue()
		
		double password=WorkbookFactory.create(f).getSheet("marks").getRow(3).getCell(1).getNumericCellValue();//method of cell-->getNumericCellValue()(for numeric val)use string(diff datatype) get NUlpointerexception

		// double  data1=c.getNumericCellValue();//update String from numeric
		  //String d=String.valueOf(password);
	    System.out.println(password);
	   
		Sheet s=WorkbookFactory.create(f).getSheet("marks");//add external xl sheet from desktop to java memory
		Row r=s.getRow(i);
		
		for(i=1;i<5;i++)
		{
			/*int j=1;
			if(j==1)
			{
				
				//Cell c=r.getCell(j);
				Cell c=s.getRow(i).getCell(j);
				
				double x=c.getNumericCellValue();
				 String z=String.valueOf(x);
				System.out.print(z);
			}
			System.out.println();8
			/
			 * 
			 */
			 for(int j=0;j<2;j++) //inner loop for cell/col 
	     	 {
	     		 Cell c=s.getRow(i).getCell(j);//changing val row n cell
	     		 //return value string by getStringCellValue() so returntype is string 
	     		 //method call with ref of Sheet val
	     		double x=c.getNumericCellValue();
	     		 String z=String.valueOf(x);
	     		
	     		 System.out.println(z);
	     	 
	     	 }
	     	}
	       
		}
	}


