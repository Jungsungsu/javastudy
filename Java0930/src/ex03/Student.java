package ex03;

public class Student {

	// 학생의 데이터: 이름,학번,나이,Java점수,Web점수,Android점수
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	// 학생 정보를 보관하는 클래스
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
    
	
	//학생정보를 출력하는 메소드
	public void show() {
		System.out.println(name + "님 안녕하세요.");
		System.out.println("[ " + number + ", " + age + "살" + "]");
		System.out.println(name + "님의 Java점수는 " + scoreJava + "점 입니다.");
		System.out.println(name + "님의 Web점수는 " + scoreWeb + "점 입니다.");
		System.out.println(name + "님의 Android점수는 " + scoreAndroid + "점 입니다.");
		
	}
	
	
//	@Override
//	public String toString() {
//		return "Student객체[name:" + name+"]";
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
