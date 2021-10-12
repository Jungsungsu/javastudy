package Java0916;

import java.util.Scanner;

public class ex_연산자5 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = scan.nextInt();
		
		//System.out.println(number + "는(은)" + (number%2 == 0? "짝수입니다" : "홀수입니다"));
		
		String result = number%2==0? "짝수" : "홀수";
		System.out.println(number + "는(은)" + result + "입니다");
		

	}

}
