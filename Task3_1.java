package Task3_0;

public class Task3_1 {
	public static void main(String[] args) {
		int result = minNumberPrint(14, 86);
		System.out.println("Меньшее число =" + " " + result);
		boolean result1 = evenNumberPrint(14);
		System.out.println("Число кратно двум =" + " " + result1);
		mathPow2(91);
		mathPow3(147);

	}

	public static int minNumberPrint(int a, int b) {
		if (a > b) {
			return b;
		} else {
			return a;
		}
	}

	public static boolean evenNumberPrint(int a) {
		boolean i = (a % 2 == 0);
		if (i)
			return true;
		else
			return false;
	}

	public static void mathPow2(int a) {
		int b = 2;
		System.out.println("Число в квадрате = " + Math.pow(a, b));
	}

	public static void mathPow3(int a) {
		int b = 3;
		System.out.println("Число в кубе = " + Math.pow(a, b));
	}
}
	
