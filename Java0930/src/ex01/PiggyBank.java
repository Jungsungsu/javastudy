package ex01;

public class PiggyBank {

	// Ŭ������ ��ü�� ����� ���� ���赵�� �ȴ�
	// ���赵�� ��ü�� ������ �� �ִ� ����� ����. -> main() �������� �ʴ�

	// Ŭ������ ���� -> �Ӽ�, ���(�޼ҵ�)
	// 1. �Ӽ� = �ʵ�, ������
	private int money;

	// 2. ��� = �ൿ, �޼ҵ�, ����
	// deposit -> ���� �ִ� �޼ҵ� �̸�
	// withdraw -> ���� �����ϴ� �޼ҵ�
	// showMoney -> �ܾ��� �����ִ� �޼ҵ�

	public PiggyBank(int money) {
		this.money += money;
	}

	// ��� �޼ҵ�� public ���� ����Ÿ���� ���� ����!
	public void deposit(int money) {
		this.money += money;
		// this.money = this.money + money
	}

	public void withdraw(int money) {
		this.money -= money;
		// this.money = this.money - money;
	}

	public void showMoney() {
		System.out.println("���� �ܾ� : " + this.money);
	}
   
}
