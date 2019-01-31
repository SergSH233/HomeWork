package Task2_0;

import java.util.Arrays;

public class Task2_4 { // Сортировка элементов
	public static void main(String[] args) {
		int size = 9;
		double[] back = new double[size];
		for (int i = 0; i < back.length; i++) {
			back[i] = Math.random() * 9;
			System.out.println(back[i] + " ");
		}
		System.out.print("\nПо убыванию: \n");
		Arrays.sort(back);
		for (int i = back.length - 1; i >= 0; i--) {
			System.out.print(back[i] + "  ");

		}
		System.out.print("\nПо возрастанию: \n");
		Arrays.sort(back);
		for (int i = 0; i < back.length; i++) {
			System.out.print(back[i] + "  ");
		}
	}
}
	
	

