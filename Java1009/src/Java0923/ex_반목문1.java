package Java0923;

import java.util.Scanner;

public class ex_반목문1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num = 0;
		while(num <= 10) {
			System.out.print("정수입력 : ");
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");
	}

}
