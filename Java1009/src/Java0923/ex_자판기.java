package Java0923;

import java.util.Scanner;

public class ex_���Ǳ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ݾ��� �Է��ϼ���. : ");
		int money = sc.nextInt();
		
		System.out.println("�޴��� ������.");
		System.out.print("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��) >> ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			if(money >= 800) {
			//	money = money - 800;
				money -= 800;

			}else {
				System.out.println("���� �����մϴ� �̤�");
			}
			break;
		case 2:
			if(money >= 500) {
				money-=500;
			}else {
				System.out.println("���� �����մϴ� �̤�");
			}

			break;
		case 3:
			if(money >= 1500) {
				money-=1500;
			}else {
				System.out.println("���� �����մϴ� �̤�");
			}
			
			break;
		}
		System.out.println("�ܵ� : " + money);
		
		int a = money/1000;
		int b = money%1000/500;
		int c = money%500/100;
		
		System.out.println("õ�� : " + a + "��, ����� :" + b + "��, ��� : " + c + "��");// TODO Auto-generated method stub

	}

}
