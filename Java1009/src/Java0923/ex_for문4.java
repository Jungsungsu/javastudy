package Java0923;

import java.util.Scanner;

public class ex_for문4 {

	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력 받은 정수까지 순차적으로
				//출력하는 프로그램을 구현하시오.
				//ex) 입력한 숫자: 10
				//1 2 3 4 5 ~ 8 9 10
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("정수 입력 : ");
				
				int num = scan.nextInt();
				
				for(int i = 1; i<=num; i++) {
					System.out.println(i);
				}

	}

}
