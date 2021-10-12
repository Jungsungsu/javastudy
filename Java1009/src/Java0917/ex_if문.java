package Java0917;

import java.util.Scanner;

public class ex_if문 {

	public static void main(String[] args) {
		// 키보드 입력을 위한 필요 기능 불러오기
				Scanner sc = new Scanner(System.in);
				
				//사용자에 입력될 내용에 대한 안내 출력해 주기
				System.out.print("나이 입력 : ");
				// 사용자가 키보드로 부터 입력한 정수값을 정수형 age 변수에 저장하기
				int age = sc.nextInt();
				
				// 입력된 age 값을 성인인지 아닌지 판단하기
				if(age >= 20) {
					// 실행문장들은 if문의 조건에 해당하는 녀석들!
					System.out.println("성인입니다.");
				}
				
				System.out.println("프로그램 종료..");

	}

}
