
public class ex_method_2 {

	public static void main(String[] args) {

		// �żҵ� ȣ��
		say();         //�ٷ� ����� �� �ִ� ��¹��� ����

		//getMsg�޼ҵ� ȣ��
		getMsg();      //���� ���ϸ� �ϰ� ����ϴ� ����� ���� ������ �ܼ�â�� ��µ��� ����
		
		//�Ʒ� �ڵ�� ���� ��¹��� �ٷ� �ְų� Ȥ�� ������ ����� �� �ֵ��� �����ؾ� ��
		System.out.println(getMsg());
		
		//intro �޼ҵ� ȣ��
		intro("������");
		
		
		
		//threeNumberSum �޼ҵ� ȣ��
		int sum = threeNumberSum(2,2,2);
		double avg = sum/3.0;
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
	}
	// �޼ҵ� ����
	// 1.�Ű�����X ���ϰ�X
	// 2.�Ű�����X ���ϰ�O
	// 3.�Ű�����O ���ϰ�X
	// 4.�Ű�����O ���ϰ�O

	public static void say() {
		System.out.println("�޼ҵ�� �ݺ������� �ۼ��� �ڵ带 �ּ�ȭ �� �� �־��!");
	}
	
	public static String getMsg() {
		return "�޼ҵ�� ������ ��ɹ����� �����̿���!";
	}
	public static void intro(String name) {
		System.out.println("���� " + name + "�Դϴ�. �ݰ�����!");
	}
	public static int threeNumberSum(int num1,int num2, int num3) {
		
		int result = num1+num2+num3;
		
		return result;
		//return��
		//-�޼ҵ� ���࿡ ���� ������� ��ȯ�� ��
		//-Ȥ�� �߰��� �ڵ带 �ߴ��� ��
		//-return�� �Ʒ����� �ڵ带 �ۼ��� �� ����!
		//System.out.println("Hello");
	}
	
}
