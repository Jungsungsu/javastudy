package Java0923;

import java.util.Scanner;

public class ex_for��4 {

	public static void main(String[] args) {
		//������ �Է� �޾� 1���� �Է� ���� �������� ����������
				//����ϴ� ���α׷��� �����Ͻÿ�.
				//ex) �Է��� ����: 10
				//1 2 3 4 5 ~ 8 9 10
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("���� �Է� : ");
				
				int num = scan.nextInt();
				
				for(int i = 1; i<=num; i++) {
					System.out.println(i);
				}

	}

}
