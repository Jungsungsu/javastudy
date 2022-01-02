
public class ex_method_2 {

	public static void main(String[] args) {

		// 매소드 호출
		say();         //바로 출력할 수 있는 출력문이 있음

		//getMsg메소드 호출
		getMsg();      //값을 리턴만 하고 출력하는 명령은 없기 때문에 콘솔창에 출력되지 않음
		
		//아래 코드와 같이 출력문에 바로 넣거나 혹은 변수에 저장될 수 있도록 구현해야 함
		System.out.println(getMsg());
		
		//intro 메소드 호출
		intro("정성수");
		
		
		
		//threeNumberSum 메소드 호출
		int sum = threeNumberSum(2,2,2);
		double avg = sum/3.0;
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		
	}
	// 메소드 구조
	// 1.매개변수X 리턴값X
	// 2.매개변수X 리턴값O
	// 3.매개변수O 리턴값X
	// 4.매개변수O 리턴값O

	public static void say() {
		System.out.println("메소드는 반복적으로 작성된 코드를 최소화 할 수 있어요!");
	}
	
	public static String getMsg() {
		return "메소드는 실행할 명령문들의 집합이에요!";
	}
	public static void intro(String name) {
		System.out.println("저는 " + name + "입니다. 반가워요!");
	}
	public static int threeNumberSum(int num1,int num2, int num3) {
		
		int result = num1+num2+num3;
		
		return result;
		//return문
		//-메소드 실행에 대한 결과값을 반환할 때
		//-혹은 중간에 코드를 중단할 때
		//-return문 아래에는 코드를 작성할 수 없음!
		//System.out.println("Hello");
	}
	
}
