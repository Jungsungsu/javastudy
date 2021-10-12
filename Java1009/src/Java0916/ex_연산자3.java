package Java0916;

import java.util.Scanner;

public class ex_연산자3 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Java 점수 입력 : ");
		int number1 = scan.nextInt();
		
		System.out.print("Web 점수 입력 : ");
		int number2 = scan.nextInt();
		
		System.out.print("Android 점수 입력 : ");
		int number3 = scan.nextInt();
		
		System.out.println("합계 :  " + (number1 + number2 + number3));
		System.out.println("평균 : " + (number1 + number2 + number3)/3);
		

	}

}
