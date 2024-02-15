package asseration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert_equals {
	@Test
	public void main()
	{
		String actual="arpit";
		String expected="mishra";
		SoftAssert s1=new SoftAssert();
		//s1.assertEquals(actual, expected);
		s1.assertNotEquals(actual, expected);
		s1.assertAll();
	}

}
