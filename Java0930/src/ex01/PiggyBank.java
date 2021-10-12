package ex01;

public class PiggyBank {

	// 클래스는 객체를 만들기 위한 설계도만 된다
	// 설계도는 객체를 생성할 수 있는 기능이 없다. -> main() 존재하지 않다

	// 클래스의 구조 -> 속성, 기능(메소드)
	// 1. 속성 = 필드, 데이터
	private int money;

	// 2. 기능 = 행동, 메소드, 로직
	// deposit -> 돈을 넣는 메소드 이름
	// withdraw -> 돈을 인출하는 메소드
	// showMoney -> 잔액을 보여주는 메소드

	public PiggyBank(int money) {
		this.money += money;
	}

	// 모든 메소드는 public 으로 리턴타입이 없이 생성!
	public void deposit(int money) {
		this.money += money;
		// this.money = this.money + money
	}

	public void withdraw(int money) {
		this.money -= money;
		// this.money = this.money - money;
	}

	public void showMoney() {
		System.out.println("현재 잔액 : " + this.money);
	}
   
}
