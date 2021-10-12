package ex01;

public abstract class Car {

	// 다양한 자동차를 공통적으로 만들 수 있는 추상 클래스 만들기!
	// 추상 클래스 -> 여러 객체에서 공통적으로 사용되는 내용을 가지고 있는 것!
	
	
	// 기본 메소드 생성 -> runner()
//	public void runner() {
//		//부모가 가지고 있던 내용을 추상적으로 만들어 자식이 새롭게 쓸 수 있도록 한다.
//		System.out.println("쌩쌩 주행하기!");
//	}
    
	//메소드가 가져야 하는 실행에 대한 구체적인 몸체 ({})가 존재하지 않는다
	//메소드 앞에 abstract이라고 하는 키워드 붙는다
	//추상 클래스에 포함되어야 하는 메소드
	// -> 추상 메소드!
	public abstract void runner();
	
	public void color() {
		System.out.println("블랙 색상의 자동차!");
	}
}
