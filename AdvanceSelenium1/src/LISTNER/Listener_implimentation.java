package LISTNER;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class Listener_implimentation extends Base_class implements ITestListener{

	int i=0;
	@Override
	public void onTestStart(ITestResult result) {
		
     Reporter.log("execution is start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("execution is sucess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("execution is fail",true);
		
	File li = driver.getScreenshotAs(OutputType.FILE);
	File f1=new File("./screenshot/"+i+"demo"+".png");
	try {
		Files.copy(li, f1);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	i++;
	}
	
	

}
