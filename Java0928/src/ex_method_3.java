
public class ex_method_3 {

	public static void main(String[] args) {
	
		add(3,5);  //2번째
        sub(3,5);  //6번째
        mul(3,5);  //7번째
        div(3,5);  //8번쨰
}
	
	//사칙연산 메소드 구현 ---> 매개변수O 리턴값X
	public static void add(int num1,int num2) {
		System.out.println(num1/num2);     // 1번째
	}
	public static void sub(int num1,int num2) {
		System.out.println(num1*num2);    //3번째
	}
	public static void mul(int num1,int num2) {
		System.out.println(num1-num2);     // 4번째
	}
	public static void div(int num1,int num2) {
		System.out.println(num1+num2);     // 5번째
	}
	
	
}


