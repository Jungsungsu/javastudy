package Java0916;

import java.util.Scanner;

public class ex_������3 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Java ���� �Է� : ");
		int number1 = scan.nextInt();
		
		System.out.print("Web ���� �Է� : ");
		int number2 = scan.nextInt();
		
		System.out.print("Android ���� �Է� : ");
		int number3 = scan.nextInt();
		
		System.out.println("�հ� :  " + (number1 + number2 + number3));
		System.out.println("��� : " + (number1 + number2 + number3)/3);
		

	}

}
