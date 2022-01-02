import java.util.Scanner;

public class ex_if_else문_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		
		// 지역변수 : 특정 영역의 부분에서만 사용이 가능한 변수
		// 전역변수 : 전체 영역의 부분에서만 사용이 가능한 변수
		           //(main 메소드에서 선언된 변수)
		
		//int result = 0;
		String result = "";
		
		if(num % 10 >= 5) {
			//반올림 진행
			//num = 128 -> 130
		//	result = (num/10 + 1) * 10;
			result = (num/10 + 1) + "0";
		}else {
			// 반올림 X
			//result = (num/10) * 10;
			result = (num/10) + "0";
		}
		
		System.out.println("반올림 수 : " + result);

	}

}
