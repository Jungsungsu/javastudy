import java.util.Random;
import java.util.Scanner;

public class ex_method_1 {

	public static void main(String[] args) {

	// �޼ҵ� 1

	// �޼ҵ� ȣ�� = �����Ѵ�;
		hello();
		
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();  // �Ű�����X ���ϰ�O
		System.out.println(msg);
		
		Random ran = new Random();
		ran.nextInt(5);
		
	}
	// �޼ҵ� ���� - �Ű�����X ���ϰ�X
	// ���������� ����Ÿ��(��ȯ �ڷ���) �޼ҵ��̸�(�Ű�����1, �Ű�����2, �Ű�����3, ...) {}

	public static void hello() {
		System.out.println(true);
	}
}
