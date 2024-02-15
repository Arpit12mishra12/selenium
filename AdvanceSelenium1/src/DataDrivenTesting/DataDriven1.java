package DataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataDriven1 {

	@Test
	public void testcase() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\datadriven.xlsx");
		
		Workbook w=WorkbookFactory.create(fis);
		
		String value1 = w.getSheet("sheet1").getRow(0).getCell(0).toString();
		String value2 = w.getSheet("sheet1").getRow(0).getCell(1).toString();
		String value3 = w.getSheet("sheet1").getRow(1).getCell(0).toString();
		String value4 = w.getSheet("sheet1").getRow(1).getCell(1).toString();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		
		
		}
}
