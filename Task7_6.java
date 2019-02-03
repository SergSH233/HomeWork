package Sorting;

import java.util.Scanner;

public class Task7_6 {
	public static void main(String []args) {
		int n; 
        String string;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter size words (1-..) and then enter a words:");
        if (scan.hasNextInt ()) {
            n = Integer.parseInt (scan.nextLine());
            string = scan.nextLine ();
            int wordCount = 0;
            for (String word :string.split (" ", n)) {
                int count = 0;
                for (int i = 1; i < word.length (); i++) {
                    if (word.toCharArray ()[i] > word.toCharArray ()[i - 1]) {
                        count++;
                    }
                }
                System.out.println("Word = "+word+": count = "+count);
                if ((word.length () - 1 == count) && (word.length () > 1) && (wordCount == 0)) {
                    System.out.println (word);
                    wordCount++;
                }

            }
            if (wordCount == 0)
                System.out.println ("NOT FOUND");
        
	}
	}
}
