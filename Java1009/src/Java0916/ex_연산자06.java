package Java0916;

import java.util.Scanner;

public class ex_������06 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int number3 = scan.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int number4 = scan.nextInt();
		
		int result = (number3 < number4)? number4-number3 : number3-number4;
		
		System.out.println("�� ���� �� : " + result);

	}

}
