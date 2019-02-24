package Core;

import static Core.Math_Mas.add;
import static Core.Math_Mas.compar;
import static Core.Math_Mas.dis;
import static Core.Math_Mas.mult;
import static Core.Math_Mas.sub;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMath {
	@Test(groups = {"C"})
	public void addTestwork() {
		int a = 7, b = 12, s = 21;
		int res = add(a,b);
		Assert.assertEquals(res, s, "Error add work!!! "); //Test Error
	  }
	@Test(groups = {"C"},enabled = false)//Test skip
	public void subTestwork() {
		int a = 300, b = 147, result = 153;
		int res = sub(a,b);
		Assert.assertEquals(res, result, "Error sub work!!! ");
	  }
	@Test(groups = {"B"})
	public void multTest() {
		int a = 5, b = 5, result = 25;
		int res = mult(a,b);
		Assert.assertEquals(res, result, "Error mult!!! ");
	  }
	@Test(groups = {"B"})
	public void disTest() {
		int a = 81, b = 9, result = 9;
		int res = dis(a,b);
		Assert.assertEquals(res, result, "Error Dis!!! ");
	  }
	@Test(groups = {"D"})
	public void comparTest() {
		int a = 125, b = 115;
		boolean result = true;
		boolean res = compar(a,b);
		Assert.assertEquals(res, result, "Error compar!!! ");
	  }
}
