package Java0924;

import java.util.Scanner;

public class ex_for_���Է� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}

}
