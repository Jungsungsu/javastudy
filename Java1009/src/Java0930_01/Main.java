package Java0930_01;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			System.out.print("���� ���� �ݾ��� �Ա��ϼ��� : ");
			int pay = sc.nextInt();
			
			// ��ü�� main()�� �ִ� �������� ������ �����ϴ�!

			PiggyBank piggy = new PiggyBank(pay); // ���ο� PiggyBank��� �޼ҵ��̸��� �����ؼ� piggy��� ������ ����
			
			piggy.showMoney();
			
			

			System.out.print("�Ա��� �ݾ� �Է��ϱ� : ");
			pay = sc.nextInt();
			// 1500�� �Ա� �ϱ�!
			piggy.deposit(pay);

			// �ܾ� ����ֱ�
			piggy.showMoney();

			System.out.print("������ �ݾ� �Է��ϱ� : ");
			pay = sc.nextInt();
			
			//���� �Է��� �ݾ��� �����ϴ� ���
			piggy.withdraw(pay);        
			//������ �����ؼ� �ݾ��� ����!
			piggy.withdraw(10000);
			piggy.showMoney();

	}

}
