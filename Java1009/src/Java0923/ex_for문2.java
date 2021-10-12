package Java0923;

public class ex_for문2 {

	public static void main(String[] args) {

		//1. 1~100까지 숫자를 출력하시오.
		//for(int i = 1; i<=100; i++)
			//System.out.println(i);
		
		//2. 100~1까지 숫자를 출력하시오.
		//for(int i = 100; i>0; i--)
		     // System.out.println(i);
		
		//3. A~Z까지 문자를 출력하시오.
		//*아스키코드
		//for(char i = 65; i<=90; i++) {
		//	System.out.println((char)i);
		//}
		
		//문자형은 숫자연산가능
		for(char i = 'A'; i<='Z'; i++) {
			System.out.println(i);
		}

	}

}
