package Core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class testMassive {
	public testMassive() {
	}
	

	@Before
	public void setUp() throws Exception {
	}

	@Test(timeout = 300)
	public void testSum() throws InterruptedException {
		System.out.println("Sum");
		int a = 2;
		int b = 3; 
		int expResult = 5;
		int result = Massive.Sum(a, b);
		assertEquals(expResult, result);
		
		
		//Assert.assertEquals(5, Math.addExact(2, 3));
	}
	@Test(expected = ArithmeticException.class)
	public void testDiv() throws InterruptedException{
		int a = 8;
		int b = 0; 
		int expResult = 4;
		int result = Massive.div(a/b, expResult);
		assertEquals(expResult, result);
	}
}
