package Java0930_01;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			System.out.print("최초 개설 금액을 입금하세요 : ");
			int pay = sc.nextInt();
			
			// 객체는 main()가 있는 곳에서만 생성이 가능하다!

			PiggyBank piggy = new PiggyBank(pay); // 새로운 PiggyBank라는 메소드이름을 지정해서 piggy라는 변수에 저장
			
			piggy.showMoney();
			
			

			System.out.print("입금할 금액 입력하기 : ");
			pay = sc.nextInt();
			// 1500원 입금 하기!
			piggy.deposit(pay);

			// 잔액 띄워주기
			piggy.showMoney();

			System.out.print("인출할 금액 입력하기 : ");
			pay = sc.nextInt();
			
			//내가 입력한 금액을 인출하는 기능
			piggy.withdraw(pay);        
			//누군가 접근해서 금액을 인출!
			piggy.withdraw(10000);
			piggy.showMoney();

	}

}
