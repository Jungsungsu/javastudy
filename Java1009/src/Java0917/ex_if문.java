package Java0917;

import java.util.Scanner;

public class ex_if�� {

	public static void main(String[] args) {
		// Ű���� �Է��� ���� �ʿ� ��� �ҷ�����
				Scanner sc = new Scanner(System.in);
				
				//����ڿ� �Էµ� ���뿡 ���� �ȳ� ����� �ֱ�
				System.out.print("���� �Է� : ");
				// ����ڰ� Ű����� ���� �Է��� �������� ������ age ������ �����ϱ�
				int age = sc.nextInt();
				
				// �Էµ� age ���� �������� �ƴ��� �Ǵ��ϱ�
				if(age >= 20) {
					// ���๮����� if���� ���ǿ� �ش��ϴ� �༮��!
					System.out.println("�����Դϴ�.");
				}
				
				System.out.println("���α׷� ����..");

	}

}
