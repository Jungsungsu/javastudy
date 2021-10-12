package Java0923;

import java.util.Scanner;

public class ex_for문5 {

	   public static void main(String[] args) {

		//100 이하의 두 정수를 입력 받아 작은 수부터 큰 수까지
		// 순차적으로 출력하는 프로그램을 구현하시오.
		//ex) 1과 3을 입력 -> 1 2 3 출력
		//    7과 5를 입력 -> 5 6 7 출력
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		
		if(num1 > 100 || num2 > 100) {
			System.out.println("엣헴.. 100이하의 숫자만 입력주세요..!");
		}else {
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			for(int i = num1; i<=num2; i++) {
				System.out.print(i);
				
			
		}
		}

	}

}
