package 상속3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("원본 데이터 ");
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		dog.move();
		cat.move();
		bird.move();
		
		//Casting (형변환)
		//강아지, 고양이, 새 -> 동물이다
		//자식 클래스들은 부모클래스에 포함된다!
		
		
		
		int a = 3;
		double b = 4.5;
		b = a;
		// 4.5 = 3
		
		
		System.out.println();
		System.out.println("업캐스팅 결과");
		
		// 업캐스팅(자동 형변환)
		// 자식 클래스가 부모클래스 타입으로 형태가 변환되는 것! -> 다형성
		// 변수의 타입은 부모 클래스, 객체 자식 클래스
		// 중요!) 업캐스팅은 상속의 관계에서만 성립된다!
		
		// 자식클래스에 부모 클래스의 메소드가 오버라이딩 되어 있지 않다면
		// 부모의 메소드를 호출한다!
		// <-> 오버라이딩이 되어있다! 자식 클래스에 있는 메소드가 호출 된다!
		
		
		// ex) 객체 생성! 나의 객체타입 = new 나의 객체 클래스
		// ex) Dog dog = new dog();
		
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		
		
		a1.move();
		a2.move();
		a3.move();
		
		//모두가 다 동물이라는 타입으로 존재하지만 실제 만들어진 객체의 타입이 다름으로
		//똑같은 메소드를 호출 하더라도 서로 다른 움직임을 가질 수 있다! -> 다형성!
		
		// 다운 캐스팅 : 강제적인 형태 변환이 필요하다!
		// -> 업캐스팅 되어 있는 객체를 원래의 형태로 돌려주는 것을 다운 캐스팅이라고 한다.
		// 중요!) 반드시 업캐스팅 되어 있는 객체에 한해서만 다운캐스팅으로 되돌아 올수 있다.
		
		
		//런타임 오류
		//Dog d1 = (Dog) new Animal();  
		// 동물은 강아지 입니다. / 동물은 고양이 입니다.
		
		System.out.println();
		Dog d2 = (Dog) a1;
		Cat c2 = (Cat) a2;
		
		
		d2.move();
		c2.move();
		
		Cat c3 = new Cat();
		

	}
	


}
