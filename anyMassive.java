package Massives;

import java.util.Scanner;

public class anyMassive {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter size (integer) ");
		//Введите размер(целое число)
		if(scanner.hasNextInt()) {
			size = scanner.nextInt();
		}
		scanner.close();
		//диапазон значений для элементов массива
		int a = 0;
		int b = 31;
		// создаем массив array и заполняем рандомными данными в диапазоне
		int [] arrey = new int[size];
		arrey = createRandomMassiveInDiaposon(arrey, a, b);
		
		//Вывод массва в прямом и в обратном порядкке
		Massiv massiv = new Massiv();
		massiv.printMassiveAsLine(arrey);
		massiv.printReverseMassiveAsLine(arrey);
		
		//Сумма элементов массива
		int sum = massiv.getSumOfElements(arrey);
		System.out.println("Sum elements massive " + sum);
		//Умножение элементов на три
		arrey = massiv.multiptyBy3(arrey);
		System.out.println("\n massiv multiplied by three ");
		//Вывод получившихся результатов в прямом и обратном порядке
		massiv.printMassiveAsLine(arrey);
		massiv.printReverseMassiveAsLine(arrey);
		//Сумма после умножения
		int sum2 = massiv.getSumOfElements(arrey);
		System.out.println("Sum elements after multiplied " + sum2);
		
		
	}
	//Создание рандомного массива
	public static int []createRandomMassiveInDiaposon(int [] mas, int a, int b){
		for(int i = 0; i < mas.length; i++) {
			mas[i] = (int) (a + (Math.random()*b));	
		}
		return mas;
		
	}
	

}
