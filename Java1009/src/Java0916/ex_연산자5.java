package Java0916;

import java.util.Scanner;

public class ex_������5 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int number = scan.nextInt();
		
		//System.out.println(number + "��(��)" + (number%2 == 0? "¦���Դϴ�" : "Ȧ���Դϴ�"));
		
		String result = number%2==0? "¦��" : "Ȧ��";
		System.out.println(number + "��(��)" + result + "�Դϴ�");
		

	}

}
