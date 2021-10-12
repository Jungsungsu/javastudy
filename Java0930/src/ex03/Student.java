package ex03;

public class Student {

	// �л��� ������: �̸�,�й�,����,Java����,Web����,Android����
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	// �л� ������ �����ϴ� Ŭ����
	public Student() {}

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
    
	
	//�л������� ����ϴ� �޼ҵ�
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[ " + number + ", " + age + "��" + "]");
		System.out.println(name + "���� Java������ " + scoreJava + "�� �Դϴ�.");
		System.out.println(name + "���� Web������ " + scoreWeb + "�� �Դϴ�.");
		System.out.println(name + "���� Android������ " + scoreAndroid + "�� �Դϴ�.");
		
	}
	
	
//	@Override
//	public String toString() {
//		return "Student��ü[name:" + name+"]";
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", age=" + age + ", scoreJava=" + scoreJava
				+ ", scoreWeb=" + scoreWeb + ", scoreAndroid=" + scoreAndroid + "]";
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
