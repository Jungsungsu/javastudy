package 상속3;

public class Bird extends Animal{

	@Override
	public void move() {
		System.out.println("새가 두 발로 움직인다!");
	}

	@Override
	public void eat() {
		System.out.println("새는 부리로 밥먹는다!");
	}

	
}
