import java.util.Scanner;

public class ex_반복문2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문이 실행되는 조건은 검사조건이 true 일 때!
		// false -> 반복 중지

		boolean run = true;
		
		
		while(run) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num > 10) {
				// 반복문 빠져나가기
				System.out.println("종료되었습니다..");
				//break;
				run = false;
			}
		}
		
		
		
		

	}

}
