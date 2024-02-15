package Cross_browser;

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class baseclass {
	
	public static WebDriver driver;
@Parameters("Browser")

@BeforeClass
public void base(String b)
{
	if(b.contains("chrome"))
	{
	driver=new ChromeDriver();
	}
	else if(b.contains("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(b.contains("firefox"))
	{
		driver=new FirefoxDriver();
	}
}
}
