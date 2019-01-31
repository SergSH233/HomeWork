package Task2_0;

public class Task2_2 {
	public static void main(String[] args) {
		int size = 9;
		double[] back = new double[size];
		for (int i = 0; i < back.length; i += 3) {
			back[i] = Math.random() * 9;
			back[i] *= 2;

			System.out.println((back[i] * 2));
		}
		for (int i = 0; i < back.length; i++) {
			if (i % 3 == 0)
				;
			back[i] *= 2;
			System.out.println("Второй способ" + " " + (back[i] *= 2));
		}

	}
}
