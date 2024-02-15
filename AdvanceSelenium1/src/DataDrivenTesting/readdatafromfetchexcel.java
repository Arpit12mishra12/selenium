package DataDrivenTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class readdatafromfetchexcel {

	@Test
	public void testCase() throws Throwable
	{
		String value = FetchExcel.data("Sheet1",0,0);
		String value1 = FetchExcel.data("Sheet1",0,1);
		Reporter.log(value,true);
		Reporter.log(value1,true);
		
		String value2 = FetchExcel.data("Sheet2",0,0);
		Reporter.log(value2,true);
	}
}
