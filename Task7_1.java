package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task7_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter n - number of lines");
		int n = Integer.parseInt(scanner.nextLine());
		int average = 0;
		String[] string = new String[n];
		System.out.println("Enter lines: ");
		for (int i = 0; i < n; i++) {
			string[i] = scanner.nextLine();
			average += string[i].length();
		}
		Arrays.sort(string, Comparator.comparingInt(String::length));
		System.out.println(Arrays.toString(string));

		average = average / n;
		System.out.println("Averenge size: " + average);
		for (int i = 0; i < n; i++) {
			if (string[i].length() < average)
				System.out.println("(" + string[i].length() + "): \"" + string[i] + "\"");
		}

	}

}
