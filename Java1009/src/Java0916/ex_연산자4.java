package Java0916;

import java.util.Scanner;

public class ex_������4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("�ѱݾ� �Է� : ");
		
		int number1 = scan.nextInt();
		
		
		System.out.println("�ܵ� : " + number1 + "��");
		System.out.println("10000�� : " + (number1/10000) + "��");
		System.out.println("5000�� : " + (number1%10000/5000) + "��");
		System.out.println("1000�� : " + (number1%10000%5000/1000) + "��");
		System.out.println("500�� : " + (number1%10000%5000%1000/500) + "��");
		System.out.println("100�� : " +(number1%10000%5000%1000%500/100) + "��");

	}

}
