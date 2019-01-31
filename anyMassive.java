package Massives;

import java.util.Scanner;

public class anyMassive {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter size (integer) ");
		//������� ������(����� �����)
		if(scanner.hasNextInt()) {
			size = scanner.nextInt();
		}
		scanner.close();
		//�������� �������� ��� ��������� �������
		int a = 0;
		int b = 31;
		// ������� ������ array � ��������� ���������� ������� � ���������
		int [] arrey = new int[size];
		arrey = createRandomMassiveInDiaposon(arrey, a, b);
		
		//����� ������ � ������ � � �������� ��������
		Massiv massiv = new Massiv();
		massiv.printMassiveAsLine(arrey);
		massiv.printReverseMassiveAsLine(arrey);
		
		//����� ��������� �������
		int sum = massiv.getSumOfElements(arrey);
		System.out.println("Sum elements massive " + sum);
		//��������� ��������� �� ���
		arrey = massiv.multiptyBy3(arrey);
		System.out.println("\n massiv multiplied by three ");
		//����� ������������ ����������� � ������ � �������� �������
		massiv.printMassiveAsLine(arrey);
		massiv.printReverseMassiveAsLine(arrey);
		//����� ����� ���������
		int sum2 = massiv.getSumOfElements(arrey);
		System.out.println("Sum elements after multiplied " + sum2);
		
		
	}
	//�������� ���������� �������
	public static int []createRandomMassiveInDiaposon(int [] mas, int a, int b){
		for(int i = 0; i < mas.length; i++) {
			mas[i] = (int) (a + (Math.random()*b));	
		}
		return mas;
		
	}
	

}
