package Core;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(value = Parametrized.class)
public class testMassive2{ 
	private int a;
	private int b;
	private int expResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object [][] {{4, 2, 2}, {12, 4, 3}, {24, 8, 4}};
		return Arrays.asList(data);
	}

	@Test
	public void Mult() throws InterruptedException{
			int result = Massive.Mult(expResult,(a*b));
			assertEquals(expResult, result);
	}
	
	}