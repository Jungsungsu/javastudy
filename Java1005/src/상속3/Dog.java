package 상속3;

public class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("개가 이동!");
	}

	@Override
	public void eat() {
		System.out.println("개가 밥을 먹는다!!");
	}

	
}
