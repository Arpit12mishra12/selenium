package Seleniumbatch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapro {
@DataProvider(name = "ram")
public Object[][] data()
{
	Object[][] o= new Object[3][2];
	o[0][0]="u.p";
	o[0][1]="lucknow";
	o[1][0]="bihar";
	o[1][1]="patna";
	o[2][0]="karnatka";
	o[2][1]="banglore";
	return o;
	
}
@Test(dataProvider = "ram")
public void main(String s1,String s2)

{
	System.out.println("capital of "+s1+"is"+s2);
	
}
}
