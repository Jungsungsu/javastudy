package ���2;

public class Main {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		WheelMouse wheel = new WheelMouse();
		
		mouse.leftClick();
		mouse.rightClick();
		mouse.move();
		
		//wheel.leftClick �޼ҵ�� �θ�Ŭ������ ���ǵ� �޼ҵ带 ȣ��!
		//��, �ڽ�Ŭ����(WheelMouse)�� leftClick�޼ҵ尡 ���ǵǾ� �ִٸ� �ڽ�Ŭ������ �޼ҵ带 ȣ���Ѵ�!
		//Override �������:
		//�ڽ�Ŭ������ �޼ҵ带 ���� ȣ�� --- ������X ---> �θ�Ŭ������ �޼ҵ带 ȣ��
		wheel.leftClick();
		wheel.rightClick();
		wheel.move();
		wheel.scroll();
		
		

	}

}
