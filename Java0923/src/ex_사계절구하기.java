import java.util.Scanner;

public class ex_��������ϱ� {

	public static void main(String[] args) {
		
		// 12, 1, 2 -> �ܿ�
		// 3, 4, 5 -> �� ->1
		// 6, 7, 8 -> ���� ->2
		// 9, 10, 11 -> ���� ->3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		switch(month/3) {
		case 1:
			System.out.println(month + "���� ���Դϴ�!");
			break;
			
		case 2:
			System.out.println(month + "���� �����Դϴ�!");
			break;
			
		case 3:
			System.out.println(month + "���� �����Դϴ�!");
			break;
		default:
			System.out.println(month + "���� �ܿ��Դϴ�!");
			break;
			
				
		}
		
		
		

	}

}
