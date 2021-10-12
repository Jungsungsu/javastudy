package Java0923;

import java.util.Scanner;

public class ex_자판기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요. : ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			if(money >= 800) {
			//	money = money - 800;
				money -= 800;

			}else {
				System.out.println("돈이 부족합니다 ㅜㅜ");
			}
			break;
		case 2:
			if(money >= 500) {
				money-=500;
			}else {
				System.out.println("돈이 부족합니다 ㅜㅜ");
			}

			break;
		case 3:
			if(money >= 1500) {
				money-=1500;
			}else {
				System.out.println("돈이 부족합니다 ㅜㅜ");
			}
			
			break;
		}
		System.out.println("잔돈 : " + money);
		
		int a = money/1000;
		int b = money%1000/500;
		int c = money%500/100;
		
		System.out.println("천원 : " + a + "개, 오백원 :" + b + "개, 백원 : " + c + "개");// TODO Auto-generated method stub

	}

}
