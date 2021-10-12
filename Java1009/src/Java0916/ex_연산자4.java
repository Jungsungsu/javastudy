package Java0916;

import java.util.Scanner;

public class ex_연산자4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("총금액 입력 : ");
		
		int number1 = scan.nextInt();
		
		
		System.out.println("잔돈 : " + number1 + "원");
		System.out.println("10000원 : " + (number1/10000) + "개");
		System.out.println("5000원 : " + (number1%10000/5000) + "개");
		System.out.println("1000원 : " + (number1%10000%5000/1000) + "개");
		System.out.println("500원 : " + (number1%10000%5000%1000/500) + "개");
		System.out.println("100원 : " +(number1%10000%5000%1000%500/100) + "개");

	}

}
