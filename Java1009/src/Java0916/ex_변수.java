package Java0916;

public class ex_변수 {

	public static void main(String[] args) {
		//변수: 데이터를 저장할 수 있는 공간
        //변수선언)
	   // 데이터 타입 변수명 = 데이터;
		
		//5라는 정수형데이터를 num이라는 공간에 저장(선언&초기화)
		//int num = 5;
		
		int num; //변수선언
		num = 5; //초기화
		
		num = 10;
		System.out.println(num);
		
		//변수를 사용하는 이유
		String name = "정성수";
		int age = 27;
		String gender = "남자";
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+gender);
		
		/////////////////////////////////////////////////////////
		
		//상수 : 데이터를 담을 수 있는 공간(불변)
		//상수 선언)
		//final 데이터타입 변수명(대문자) = 값;
		final int NUMBER = 1;
		

	}

}
