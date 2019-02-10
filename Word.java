package Words;

import java.util.Scanner;

public class Word {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scan.nextLine();
		System.out.println("Enter letter which needs to be changed: ");
		char word2 = scan.next().charAt(0);
		System.out.println("Enter a character to replace: ");
		char word3 = scan.next().charAt(0);

		String world4 = word.replace(word2, word3);
		System.out.println(world4);

	}

}
