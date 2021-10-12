package ex01;

public class 포르쉐 extends Car{
    
	//추상 클래스를 물려받은 하위 클래스는
	//상위 클래스가 가지고 있는 추상적인 메소드를
	//나만의 것으로 구체화 하여 가지고 있어야 한다
	// 부모로부터 강제성을 받는다
	
	
	// 오버라이딩
	public void runner() {
		System.out.println("포르쉐 운전하기!");
	}

	
}
