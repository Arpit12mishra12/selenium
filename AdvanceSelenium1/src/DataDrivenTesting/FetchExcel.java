package DataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchExcel {

	public static  String data(String sheet, int row, int column) throws Throwable
	{
       FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\datadriven.xlsx");
		
		Workbook w=WorkbookFactory.create(fis);
		
		Sheet s = w.getSheet(sheet);
		
		String d = s.getRow(row).getCell(column).toString();
		
		return d;
		
		
	}

}
