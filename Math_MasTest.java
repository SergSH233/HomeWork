package Core;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static Core.Math_Mas.*;

public class Math_MasTest {
	public Math_MasTest() {
	}
	@DataProvider(name = "Sum")
	public static Object [][] testData(){
		return new Object [][] {{3, 5, 8}, {10, 18, 28}, {-12, 4, -8}};
	}
	@Test(groups = {"A"}, dataProvider = "Sum")
	public void addTest(int a, int b, int s) {				
		//int a = 7, b = 12, s = 19;
		int res = add(a,b);
		Assert.assertEquals(res, s, "Error add!!! ");
	  }
	@Test(groups = {"A"})
	@Parameters(value = {"a", "b", "result"})
	public void subTest(int a, int b, int result) {				//Run is XML
		//int a = 300, b = 147, result = 153;
		int res = sub(a,b);
		Assert.assertEquals(res, result, "Error sub!!! ");
	  }


}
