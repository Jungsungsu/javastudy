package Java0917;

import java.util.Scanner;

public class ex_if_else��_�ǽ�2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
		
		int result = 0;
		
		if(time > 8) {
			//result = (8*5000) + (time-8) * 7500;
		result = (int) ((8*5000) + (time-8)*5000*1.5);
			
			// ����ȯ(casting)
			
			//int a = 4;  // ������ ����ȯ
			//double b = 5.7; // ����� ����ȯ
			
			//b = a;
			//a = (int)b;
		}else {
			result = time * 5000;
		}

		System.out.println("�� �ӱ���" + result +"�� �Դϴ�.");

	}

}
