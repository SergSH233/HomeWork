package Task2_0;

public class Task2_1 {
public static void main (String[]args) {
	int size = 9;
	double mult = 1;
	double [] back = new double [size];
	for(int i = 0; i < back.length; i++) {
		back [i] = Math.random()* 9;
		mult *= back[i]; {
		System.out.println(back[i] + " " + "Произведение элементов = " + mult);
		
	}
	}
	}
}
