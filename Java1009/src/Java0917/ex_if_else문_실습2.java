package Java0917;

import java.util.Scanner;

public class ex_if_else문_실습2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int result = 0;
		
		if(time > 8) {
			//result = (8*5000) + (time-8) * 7500;
		result = (int) ((8*5000) + (time-8)*5000*1.5);
			
			// 형변환(casting)
			
			//int a = 4;  // 묵시적 형변환
			//double b = 5.7; // 명시적 형변환
			
			//b = a;
			//a = (int)b;
		}else {
			result = time * 5000;
		}

		System.out.println("총 임금은" + result +"원 입니다.");

	}

}
