package Java0927;

import java.util.Scanner;

public class ex_array5 {

	public static void main(String[] args) {
		
		//1. 10���� ������ ���� ���ڿ� �迭 name�� �ʱ�ȭ�Ͻÿ�.
		String[] names = {"����","�蹫��","������","�̵���","������","�̹���",
				         "��Į�� ���ѽ�","������","�۰�ȣ","�̹α�"};
		//2. �̸��� �Է����� �� name�迭 �� �� ��° ��ġ�� �ִ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�˻��� ����� �̸��� �ۼ����ּ���: ");
		
		String name = sc.nextLine();
		
		for(int i = 0; i<names.length; i++) {
			
			if(name.equals(names[i])) {
				System.out.println(name + "�� ��ġ�� " + (i+1) + "��°�Դϴ�.");
				break;  // ������ �̸��� ã���� �� �� �̻� �ݺ����� �ʵ��� break�� �ۼ�
				        
			}
			
			
		}
		

	}

}
