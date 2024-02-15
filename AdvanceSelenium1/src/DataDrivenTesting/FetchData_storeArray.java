package DataDrivenTesting;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchData_storeArray
{
	@DataProvider(name="login")
	public Object[] [] testcase() throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\datadriven.xlsx");
		
		Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet("sheet4");
		int row = s.getPhysicalNumberOfRows();
		int coloumn = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d=new Object[row][coloumn];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<coloumn; j++)
			{
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
		

}
	@Test(dataProvider = "login")
	public void testCase(String email, String password)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		
	}
}
