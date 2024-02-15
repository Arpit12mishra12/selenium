package LISTNER;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test_case1 extends Base_class {
@Test
public void main()
{
	driver.findElement(By.linkText("reister")).click();
}
}
