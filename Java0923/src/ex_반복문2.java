import java.util.Scanner;

public class ex_�ݺ���2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �ݺ����� ����Ǵ� ������ �˻������� true �� ��!
		// false -> �ݺ� ����

		boolean run = true;
		
		
		while(run) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			
			if(num > 10) {
				// �ݺ��� ����������
				System.out.println("����Ǿ����ϴ�..");
				//break;
				run = false;
			}
		}
		
		
		
		

	}

}
