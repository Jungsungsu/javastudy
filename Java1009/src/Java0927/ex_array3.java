package Java0927;

import java.util.Scanner;

public class ex_array3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== ���� ���� Start! ====");
		
		// �迭�� ũ��� ��Ұ��� ������ŭ ��������.
		String[] array = {"��","��"};
		
		
		System.out.print("���ڸ� �Է����ּ���>>");
		int num = sc.nextInt();
		
		// Ȧ�� -> ��
		// ¦�� -> ��
		for(int i = 1; i<=num; i ++)
			if(i%2 == 0) {
				System.out.print(array[1]);
			}else {
				System.out.print(array[0]);
			}
		 System.out.println();

	}

}
