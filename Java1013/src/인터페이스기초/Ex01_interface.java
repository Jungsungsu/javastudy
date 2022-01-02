package 인터페이스기초;

public interface Ex01_interface {

	//인터페이스
	// - 객체 생성을 할 수 없음!
	// - 구현해야 할 기능을 미리 지정하는 명세서
	// - abstract 메소드로 정의 --> 구현받는 클래스에서 반드시 오버라이딩하여 구현해야 함!(강제성)
	// - final 키워드로 상수 정의
	// - 두 키워드는 생략 가능!!
	// - 인터페이스를 일반 클래스에 적용할 때 --> public 클래스명 implements 인터페이스명
	// - 다중 구현이 가능하다! --> public 클래스명 implements 인터페이스1, 인터페이스2
	// - 인터페이스끼리 다중 상속이 가능하다! --> public interface 인터페이스명 extends 인터페이스1, 인터페이스2
	
	public static final String msg = "INTERFACE";
	
	//추상메소드 : 몸체({}실행코드)가 없는 메소드
	public abstract void show();
	
}
