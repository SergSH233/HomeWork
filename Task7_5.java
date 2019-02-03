package Sorting;

import java.util.Scanner;

public class Task7_5 {
	public static void main(String[] agrs) {
		int n;
		int numWordsWithEqualLetters = 0;
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size words (1-..) and then enter a words:");//"Введите количество набираемых слов (1-..) Затем введите слова:"
		if (scanner.hasNextLine()) {
			n = Integer.parseInt(scanner.nextLine());
			string = scanner.nextLine();
			for (String nowWord : string.split(" ", n)) {
				int countEngLetters = 0;
				int balance = 0;
				for (Character letter : nowWord.toCharArray()) {
					//System.out.println(letter + " ");
					if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
						countEngLetters++;
						// System.out.println("Показатель" + countEngLetters);
						if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
								|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
								|| (letter == 'o') || (letter == 'u') || (letter == 'y'))
							++balance;
					 else 

						--balance;
					
				}
				if (countEngLetters == nowWord.length()) {
					System.out.println("[" +nowWord +"]" +" " + "English word");
					if (balance == 0) {
						++numWordsWithEqualLetters;
						//System.out.println(nowWord + " this word ia our word!");
					}

				}
			}
			System.out.println("vowels and consonants are equal" + " " + "("+numWordsWithEqualLetters+")" +" " + "words");

		}
	}
	}}
