package Java0923;

import java.util.Random;
import java.util.Scanner;

public class ex_�ݺ���4 {

	public static void main(String[] args) {
		// ������ �����ϱ�
				Random rd = new Random();
				
				Scanner sc = new Scanner(System.in);
				
				while(true) {
				
				  int num1 = rd.nextInt(5)+1;
				  int num2 = rd.nextInt(5)+1;
				
				  System.out.print(num1 + "+" + num2 + "=");
				  int result = sc.nextInt();
				
				  if(result == (num1+num2)) {
					System.out.println("�����Դϴ�!");
				  }else {
					System.out.println("Ʋ�Ƚ��ϴ�..");
				  }
				  
				  System.out.print("��� �Ͻðڽ��ϱ�? >> ");
				  String ans = sc.next();
				  
				  if(ans.equals("n") || ans.equals("N")) {
					  System.out.println("���� �Ǿ����ϴ�.");
					  break;
				  }
				}//while ��

	}

}
