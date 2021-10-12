package 상속3;

public class Cat extends Animal{

	@Override
	public void move() {
		System.out.println("고양이가 사뿐사뿐!");
		
	}

	@Override
	public void eat() {
		System.out.println("고양이는 얌전히 밥을 먹는다!");
	}

	
}
