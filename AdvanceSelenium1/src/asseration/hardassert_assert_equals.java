package asseration;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class hardassert_assert_equals {
	@Test
	public void main()
	{
		String actual="arpit";
		String expected="mishra";
     org.testng.Assert.assertEquals(actual, expected);
		org.testng.Assert.assertNotEquals(actual, expected);
	}

}
