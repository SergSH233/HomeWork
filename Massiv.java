package Massives;

public class Massiv {
	public Massiv () {
		
	}
	public void printMassiveAsLine(int []mas) {
		String emptyChar = " ";
		//Пустое значение(какое-либо значение)(В строку)
		int length = mas.length;
		//Значение lenght = длинна массива
		System.out.println("Massive: ");
		for(int i = 0; i < length; i++) {
		System.out.println(mas[i] + emptyChar);
		}
		System.out.println();
	}
	public void printReverseMassiveAsLine(int[] mas) {
		String emptyChar = " ";
		int length = mas.length;
		System.out.println("Massive in reverse order: ");
		//Массив в обратном порядке
		for(int i = length - 1; i >= 0; i--) {
		System.out.println(mas[i] + emptyChar);	
		}
		System.out.println();
	}
	public int getSumOfElements(int []mas) {
		int length = mas.length;
		int result = 0;
		for(int i = 0; i < length; i++) {
		result = result + mas[i];
		}
		return result;
	}
	public int[] multiptyBy3 (int[]mas) {
		int length = mas.length;
		int count = 3;
		for(int i = 0; i < length; i++) {
			mas[i] = mas[i]*count;
		}
		return mas;
	}

}
