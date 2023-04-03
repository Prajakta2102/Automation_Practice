package browser_Launching;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDta_MyInfo_Xls 
{

	public static void main(String[] args) throws IOException
	{
		String path="C:\\Users\\Prasad\\Desktop\\CityInfo.xlsx";
		FileInputStream f=new FileInputStream(path);
		//String file=WorkbookFactory.create(f).getSheet("Personal_Infocity").getRow(1).getCell(1).getStringCellValue();
       
		//System.out.println(file);
	
		Sheet s=WorkbookFactory.create(f).getSheet("Personal_Infocity");
	
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<2;j++)
		{
			String str=s.getRow(i).getCell(j).getStringCellValue();
			System.out.print(str   + "   ");
		}
		System.out.println();
	}

}
}