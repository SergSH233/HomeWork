package Task5_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Patterns {
	public static boolean test;
	public static boolean test2;
	
	public void setTest(boolean testString) {
		this.test = testString;
	}
	public void setTest2(boolean testString) {
		this.test2 = testString;
	}
	public static  boolean gettest(String testString){
		Pattern p = Pattern.compile("[a-z]+{0,4}");
		Matcher m = p.matcher(testString);
		return test =  m.matches();
		
	}
	public static  boolean gettest2(String testString){
		Pattern p = Pattern.compile("[a-zA-Z_0-9]+{0,4}");
		Matcher m = p.matcher(testString);
		return test2 =  m.matches();
	}

}
