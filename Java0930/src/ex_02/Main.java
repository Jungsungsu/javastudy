package ex_02;

public class Main {

	public static void main(String[] args) {
		
		//Person 객체생성
		//클래스명 객체변수 = new 클래스명();
		Person person = new Person();
		
		//name을 초기화
		person.setName("정성수");
		
		System.out.println(person.getName());
		
		person.sleep();

	}

}
