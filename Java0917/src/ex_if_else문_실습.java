import java.util.Scanner;

public class ex_if_else��_�ǽ� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		
		// �������� : Ư�� ������ �κп����� ����� ������ ����
		// �������� : ��ü ������ �κп����� ����� ������ ����
		           //(main �޼ҵ忡�� ����� ����)
		
		//int result = 0;
		String result = "";
		
		if(num % 10 >= 5) {
			//�ݿø� ����
			//num = 128 -> 130
		//	result = (num/10 + 1) * 10;
			result = (num/10 + 1) + "0";
		}else {
			// �ݿø� X
			//result = (num/10) * 10;
			result = (num/10) + "0";
		}
		
		System.out.println("�ݿø� �� : " + result);

	}

}
