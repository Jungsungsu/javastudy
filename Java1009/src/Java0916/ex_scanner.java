package Java0916;

import java.util.Scanner;

public class ex_scanner {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.println("���� �̸��� " + name);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.println("���� ���̴� " + age);
		

	}

}
