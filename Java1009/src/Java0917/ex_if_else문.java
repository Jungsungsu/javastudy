package Java0917;

import java.util.Scanner;

public class ex_if_else�� {

	public static void main(String[] args) {
		// 20�� �̻� -> ���� �Դϴ�
				// 20�� �̸� -> �̼����� �Դϴ�
				
				// ���ǿ� ���ؼ� ���� ��� -> if(���ǽ�)
				// ���ǿ� ���ؼ� ������ ��� -> else
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("���� �Է� : ");
				int age = sc.nextInt();
				
				// if -else ����
				if(age>=20) {
					System.out.println("���� �Դϴ�.");
				}else {
					System.out.println("�̼����� �Դϴ�.");
					
				}
				
				//���� ������
				String result = age >= 20? "�����Դϴ�" : "�̼����� �Դϴ�";
				
				System.out.println(result);
				///////////////////////////////////////////////////////////


	}

}
