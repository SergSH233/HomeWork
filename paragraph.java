package Words;

import java.util.Scanner;

public class paragraph {
public static void main(String[] args) {
	
		String myParagraph = null;
		Scanner scan = new Scanner(System.in).useDelimiter("stop");
		scan.useDelimiter("stop");
		System.out.println("Enter your paragraph and at the end, enter the word \"stop\": ");
		myParagraph = scan.next();
		//System.out.println(myParagraph);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter letter which needs to be changed: ");
		char word2 = scan1.next().charAt(0);
		System.out.println("Enter a character to replace: ");
		char word3 = scan1.next().charAt(0);

		String world4 = myParagraph.replace(word2, word3);
		System.out.println(world4);
		
}
}
