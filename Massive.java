package Core;

public class Massive {
	
	public static int Sum(int a, int b) throws InterruptedException {
		Thread.sleep(200);
		return (a+b);
	}
	public static int div(int a, int b) throws InterruptedException {
		return (a/b);
	}
	public static int Mult(int a, int b) throws InterruptedException {
		return (a*b);
	}
	public int Pow(int a) {
		return (a*a);
	}

}
