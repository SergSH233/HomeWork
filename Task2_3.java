package Task2_0;

public class Task2_3 {
	public static void main (String[]args) {
		int size = 9;
		double [] back = new double [size];
		for(int i = 0; i < back.length; i++) {
			back [i] = Math.random()* 9;
	}
		int count = 0;
		for (int i = 0; i < back.length; i++) {
		if (back[i] == 0) {
		System.out.println(i);
		count++;
		}
		}
		if (count == 0)
		System.out.println("Нулевых элементов нет");
}
}