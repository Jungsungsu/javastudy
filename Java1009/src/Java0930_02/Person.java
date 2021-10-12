package Java0930_02;

public class Person {
	// Class ������� - �Ӽ�(�ʵ庯��), ���(�޼ҵ�)
		// ����� �Ӽ�: �̸�(String), ����(int)
		// ����� �ൿ: ���ϴ�, �ڴ�
		private String name;
		private int age;

		// ������: ��ü�� �ʱ�ȭ�ϴ� �޼ҵ�
		// �������� Ư¡
		// 1.Ŭ������� �����ϴ�!
		// 2.����Ÿ���� ����!
		// 3.newŰ���忡 ���ؼ� �ѹ� ȣ��ȴ�!
		public Person() {}

		// ����� ���� ������
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void talk() {
			System.out.println("���ϱ�!");
		}

		public void sleep() {
			System.out.println("����!");
		}
}
