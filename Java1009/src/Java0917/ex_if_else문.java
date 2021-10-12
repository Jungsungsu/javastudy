package Java0917;

import java.util.Scanner;

public class ex_if_else문 {

	public static void main(String[] args) {
		// 20살 이상 -> 성인 입니다
				// 20살 미만 -> 미성년자 입니다
				
				// 조건에 대해서 참일 경우 -> if(조건식)
				// 조건에 대해서 거짓을 경우 -> else
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				// if -else 구조
				if(age>=20) {
					System.out.println("성인 입니다.");
				}else {
					System.out.println("미성년자 입니다.");
					
				}
				
				//삼항 연산자
				String result = age >= 20? "성인입니다" : "미성년자 입니다";
				
				System.out.println(result);
				///////////////////////////////////////////////////////////


	}

}
