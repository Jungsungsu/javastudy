package Java0927;

import java.util.Scanner;

public class ex_array2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		// ����ڷκ��� �Է°��� �޾� �迭�� �����ϱ�!
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i + 1) + "��° �Է�>> "+ "");
			 arr[i] = sc.nextInt();
			
		}
		
		System.out.print("�Էµ� ���� : ");
	
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
