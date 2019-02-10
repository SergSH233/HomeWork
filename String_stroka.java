package Words;

import java.util.Scanner;

public class String_stroka {
	public static void main(String[] args) {

		String s = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length : ");
		String text = scan.nextLine();
		System.out.println("Enter letter which needs to be changed: ");
		char oldlitter = scan.next().charAt(0);
		System.out.println("Enter a character to replace: ");
		char newlitter = scan.next().charAt(0);
		char[] strToChar = text.toCharArray();
		for (int i = 0; i < strToChar.length; i++) {
			if (strToChar[i] == oldlitter) {
				strToChar[i] = newlitter;
				s += strToChar[i];
			}

			System.out.println(strToChar);
		}

	}
}
