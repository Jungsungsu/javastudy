package Java0929;

import java.util.Scanner;

public class ex_�޼ҵ�6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.println("��� Ȯ�� : " +result);

	}
      // �巡�� ������
	private static int getAbsoluteValue(int num1, int num2) {
		//return Math.abs(num1-num2);
		
		int result = num1-num2;
		
		if(result < 0) {
			result = -result;
		}
		
		return result;
	}
       //�巡�� ����

	}


