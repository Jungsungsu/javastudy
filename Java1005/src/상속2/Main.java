package 상속2;

public class Main {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		WheelMouse wheel = new WheelMouse();
		
		mouse.leftClick();
		mouse.rightClick();
		mouse.move();
		
		//wheel.leftClick 메소드는 부모클래스의 정의된 메소드를 호출!
		//단, 자식클래스(WheelMouse)에 leftClick메소드가 정의되어 있다면 자식클래스의 메소드를 호출한다!
		//Override 실행순서:
		//자식클래스의 메소드를 먼저 호출 --- 재정의X ---> 부모클래스의 메소드를 호출
		wheel.leftClick();
		wheel.rightClick();
		wheel.move();
		wheel.scroll();
		
		

	}

}
