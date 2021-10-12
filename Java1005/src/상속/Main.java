package 상속;

public class Main {

	public static void main(String[] args) {
		
		//상속
		// - 부모클래스의 변수와 메소드를 자식클래스가 그대로 물려받아 사용하고 새로운 기능을 확장
		
		//상속 적용방법
		// public class 자식클래스 extends 부모클래스
		
		//기본캐릭터 생성
		Character character = new Character();
		
		//앞르오가기 호출
		character.forward();
		
		//도적캐릭터 생성
		ThiefCharacter thief = new ThiefCharacter();
		
		thief.forward();
		thief.back();
		thief.jump();
		thief.throwStar();  //도적캐릭터만 가질 수 있는 기능(확장)
		
		//전사캐릭터 생성
		WarriorCharacter warrior = new WarriorCharacter();
		
		warrior.forward();
		warrior.back();
		warrior.jump();
		warrior.attack(); //전사캐릭터만 가질 수 있는 기능(확장)
		
		
		
		
		
		

	}

}
