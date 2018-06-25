package genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constant
{
   public static String ExcelSheet(String path,String sheet,int r,int c)
   {
	   String s=" ";
	   try
	   {
		   FileInputStream f=new FileInputStream(path);
		   Workbook w=WorkbookFactory.create(f);
		   s=w.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
	   }
	   
	   catch(Exception e)
	   {
		 Reporter.log("data not present", true);  
	   }
	   return s;
   }
}
