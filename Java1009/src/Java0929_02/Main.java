package Java0929_02;

public class Main {

	public static void main(String[] args) {
		// Class: ���ο� �ڷ���
				// HumanŬ������ �̿��Ͽ� Human��ü ����

				// ����(���۷���) //��ü����

				// ��ü ������ new ��� Ű���带 ����ؾ� �Ѵ�!
				Human human = new Human(); // �޼ҵ带 ã���� ����

				// human�� ���� �� �ִ� �Ӽ����� �����ϱ�!
//				human.name = "������";
//				human.age = 27;
//				human.gender = "����";
//				human.height = 173.0;
//				human.weight = 62.0;

//				System.out.println("Human�� �̸� : " + human.name);
//				System.out.println("Human�� ���� : " + human.age);
//				System.out.println("Human�� ���� : " + human.gender);
//				System.out.println("Human�� Ű : " + human.height);
//				System.out.println("Human�� ������ : " + human.weight);

				// ���赵�� ����Ͽ� �Ǵٸ� ����� ������!
				Human human2 = new Human(); // ��ü�����+ ������ �޼ҵ�
				human2.setName("�ּ���");  //�Ӽ� �����
				human2.setAge(28);
				human2.setGender("����");
				human2.setHeight(180.0);
				human2.setWeight(70.0);
		        
				
				//<�̷�>
				// ��ü�� �����Ҷ� ���� �Ӽ��� ������ �־���� �ϴ°� �����ϴ�!
				// -> ��ü�� ������ �� ���� �Ӽ����� �ο��� ����! -> ������ �޼ҵ�

				// ������ �޼ҵ�
				// new��� Ű���尡 ���Ǹ� �ڵ����� �����Ǵ� �޼ҵ�

				// -�������� Ư¡
				// 1.�����ڴ� �޼ҵ��̴�
				// 2.������ �̸��� Ŭ���� �̸��� ����
				// 3.�����ڴ� ���� Ÿ���� ������ �� ����.
				// 4.�����ڴ� new�� ���� ��ü�� ������ ���� ȣ���
				// 5.�����ڴ� �ϳ� �̻� ����Ǿ�� ��
				// 6. !�����ڰ� �����ڸ� �������� ������ �ڵ����� �⺻ �����ڰ� ���ǵ�
				// �����Ϸ��� ���� �ڵ�����
				// �⺻ �����ڸ� !����Ʈ ������ �����
				// ���� default �����ڸ� �����ϰ� default�� �ƹ��� ����� ���� ��� !������ ������

				// ex)������ �޼ҵ� ����, Ŭ���� ���鶧 ����
				// �ؾ Ʋ class -> �ؾ
				// ->�ؾ�� ���鶧 ���� ������ �ִ� �޼ҵ�
				// ->�ؾ ���鶧 ���� ���� �� �ִ� �޼ҵ�

				// ������ Ŭ����
				// ������Ŭ����
				// �Ӽ�(�ʵ�)
				// �ݾ�
				// ���(�޼ҵ�)
				// ���� �ִ´�
				// ���� �����Ѵ�
				// �ܾ��� �����ش�

				// �ؾ Ʋ �ؾ1 = new �ؾ Ʋ("��");
				// ->�ϼҸ� ������ �ִ� �ؾ!

				// �ؾ1.��= "��";

				// �ؾ Ʋ �ؾ2=new �ؾ Ʋ("��");

				Human human3 = new Human("�Ӹ���", 28, "����", 180.0, 70.0);

				System.out.println(human3.getAge());
				System.out.println(human3.getGender());
			

				Human human4 = new Human("������", 27, "����");


		        
				
				human4.setAge(26);
				System.out.println("human4�� �̸� : " + human4.getAge());


	}

}
