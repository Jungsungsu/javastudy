package Java0923;

import java.util.Scanner;

public class ex_반복문5 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 0;
		
		do {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");
			int kg = sc.nextInt();
			
			now -= kg;
		}while(now > goal);
		
		System.out.println(now + " kg 달성!! 축하합니다!");
	}

}
