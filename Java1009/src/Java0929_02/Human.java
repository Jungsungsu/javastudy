package Java0929_02;

public class Human {
	 //Class ���� : Data(�ʵ庯��)�� Logic(�޼ҵ�)���� ����
	   //����� �Ӽ� - �̸�(String),����(int),����(String),Ű(double),������(double)
	   //����� �ൿ - ����, ���ϴ�, �����ϴ�, �Դ´�, �ȴ´� ��..
	   
	
	   //�Ӽ�
	   private String name;
	   private int age;
	   private String gender;
	   private double height;
	   private double weight;
	   
	   //������ �޼ҵ�� �⺻ ������ ������� �ִ�. -> �ڵ� ����
	   
	   //������ �޼ҵ��� ����
	   //���� Ÿ��X -> void x
	   
	   //�⺻ �������� ����
	   public Human() {    
		   
	   }
	   
	   // ���� �̸��� �޼ҵ������� ���� �ٸ� ������ �ϴ� �޼ҵ� -> �޼ҵ� �����ε�(�ߺ�����)
	   public Human(String name, int age, String gender, double height, double weight) {
	       //this Ű����� ���赵�� ���� ������ �ִ� �ʵ带 ����Ų��      
		    this.name = name; // ���赵 ����//�ʿ��ѳ��� ��������
		    this.age = age;
		    this.gender = gender;
		    this.height = height;
		    this.weight = weight;
	}
	   
	   public Human(String name, int age, String gender) {
	       //this Ű����� ���赵�� ���� ������ �ִ� �ʵ带 ����Ų��      
		    this.name = name; // ���赵 ����  //�ʿ��ѳ��� ��������
		    this.age = age;
		    this.gender = gender;
		    this.height = height;
		    this.weight = weight;
	}
	   
	   
	//�ൿ
	   public void walk() {
		   System.out.println("�ȴ´�!");
	   }
	   public void smile() {
		   System.out.println("������~!");
	   }
	   public void talk() {
		   System.out.println("���ϴ�!");
	   }
	   
	   //�ܺη� ���� �Ѿ�� ������ ���� ���赵�� ������ �� �� �ִ� �޼ҵ� ����!
	   //���� �ٽ� ������ �� �ִ� ��� -> setter
	   
	   public void setAge(int age) {
		   this.age = age;
	   }
	   
	   // ���赵�� ����� ������ ���� ������ �� �� �ִ� �޼ҵ� ����!
	   // getter
	public int getAge() {
		   return this.age;
	   }
	//getter/setter �޼ҵ� ����� ����Ű -> alt+shift+s

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
