package Java0929;

import java.util.Scanner;

public class ex_메소드6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " +result);

	}
      // 드래그 시작점
	private static int getAbsoluteValue(int num1, int num2) {
		//return Math.abs(num1-num2);
		
		int result = num1-num2;
		
		if(result < 0) {
			result = -result;
		}
		
		return result;
	}
       //드래그 끝점

	}


