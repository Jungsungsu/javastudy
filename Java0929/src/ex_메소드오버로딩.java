
public class ex_�޼ҵ�����ε� {

	public static void main(String[] args) {
		
		//Method Overloading
		// : �޼ҵ��� �̸��� ����! 
		//   ��, �Ű������� Ÿ���� �ٸ��ų� ������ �ٸ��� �����ϴ� ���
		System.out.println(true);
		System.out.println(12);
		System.out.println("Hello");
	   
	}
    //Method Overloading ��� ���� ��
	public static int addTwoNumber(int num1, int num2) {
		return num1 + num2;
	}
	public static double addTwoIntFloatNumber(int num1, float num2) {
		return num1 + num2;
	}
	public static int addThreeNumber(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	//Method Overloading ��� ���� ��
	//: �޼ҵ� �̸��� �ϳ��� ����!
	public static double addNumber(int num1, int num2) {
		return num1 + num2;
	}
	public static float addNumber(int num1, float num2) {
		return num1 + num2;
	}
	public static int addNumber(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
