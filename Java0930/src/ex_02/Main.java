package ex_02;

public class Main {

	public static void main(String[] args) {
		
		//Person ��ü����
		//Ŭ������ ��ü���� = new Ŭ������();
		Person person = new Person();
		
		//name�� �ʱ�ȭ
		person.setName("������");
		
		System.out.println(person.getName());
		
		person.sleep();

	}

}
