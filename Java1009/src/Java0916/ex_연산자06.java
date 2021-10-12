package Java0916;

import java.util.Scanner;

public class ex_연산자06 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int number3 = scan.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int number4 = scan.nextInt();
		
		int result = (number3 < number4)? number4-number3 : number3-number4;
		
		System.out.println("두 수의 차 : " + result);

	}

}
