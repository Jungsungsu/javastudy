
public class ex_method_3 {

	public static void main(String[] args) {
	
		add(3,5);  //2��°
        sub(3,5);  //6��°
        mul(3,5);  //7��°
        div(3,5);  //8����
}
	
	//��Ģ���� �޼ҵ� ���� ---> �Ű�����O ���ϰ�X
	public static void add(int num1,int num2) {
		System.out.println(num1/num2);     // 1��°
	}
	public static void sub(int num1,int num2) {
		System.out.println(num1*num2);    //3��°
	}
	public static void mul(int num1,int num2) {
		System.out.println(num1-num2);     // 4��°
	}
	public static void div(int num1,int num2) {
		System.out.println(num1+num2);     // 5��°
	}
	
	
}


