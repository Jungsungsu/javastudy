
public class ex_메소드오버로딩 {

	public static void main(String[] args) {
		
		//Method Overloading
		// : 메소드의 이름은 동일! 
		//   단, 매개변수의 타입이 다르거나 개수를 다르게 정의하는 기법
		System.out.println(true);
		System.out.println(12);
		System.out.println("Hello");
	   
	}
    //Method Overloading 기법 적용 전
	public static int addTwoNumber(int num1, int num2) {
		return num1 + num2;
	}
	public static double addTwoIntFloatNumber(int num1, float num2) {
		return num1 + num2;
	}
	public static int addThreeNumber(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}
	
	//Method Overloading 기법 적용 후
	//: 메소드 이름을 하나로 통일!
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
