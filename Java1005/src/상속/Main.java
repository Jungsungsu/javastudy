package ���;

public class Main {

	public static void main(String[] args) {
		
		//���
		// - �θ�Ŭ������ ������ �޼ҵ带 �ڽ�Ŭ������ �״�� �����޾� ����ϰ� ���ο� ����� Ȯ��
		
		//��� ������
		// public class �ڽ�Ŭ���� extends �θ�Ŭ����
		
		//�⺻ĳ���� ����
		Character character = new Character();
		
		//�ո������� ȣ��
		character.forward();
		
		//����ĳ���� ����
		ThiefCharacter thief = new ThiefCharacter();
		
		thief.forward();
		thief.back();
		thief.jump();
		thief.throwStar();  //����ĳ���͸� ���� �� �ִ� ���(Ȯ��)
		
		//����ĳ���� ����
		WarriorCharacter warrior = new WarriorCharacter();
		
		warrior.forward();
		warrior.back();
		warrior.jump();
		warrior.attack(); //����ĳ���͸� ���� �� �ִ� ���(Ȯ��)
		
		
		
		
		
		

	}

}
