package Java0923;

import java.util.Scanner;

public class ex_for��5 {

	   public static void main(String[] args) {

		//100 ������ �� ������ �Է� �޾� ���� ������ ū ������
		// ���������� ����ϴ� ���α׷��� �����Ͻÿ�.
		//ex) 1�� 3�� �Է� -> 1 2 3 ���
		//    7�� 5�� �Է� -> 5 6 7 ���
		
        Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num1 = scan.nextInt();
		
		System.out.print("���� �Է� : ");
		int num2 = scan.nextInt();
		
		if(num1 > 100 || num2 > 100) {
			System.out.println("����.. 100������ ���ڸ� �Է��ּ���..!");
		}else {
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			for(int i = num1; i<=num2; i++) {
				System.out.print(i);
				
			
		}
		}

	}

}
