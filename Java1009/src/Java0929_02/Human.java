package Java0929_02;

public class Human {
	 //Class 구조 : Data(필드변수)와 Logic(메소드)으로 구성
	   //사람의 속성 - 이름(String),나이(int),성별(String),키(double),몸무게(double)
	   //사람의 행동 - 웃기, 말하다, 생각하다, 먹는다, 걷는다 등..
	   
	
	   //속성
	   private String name;
	   private int age;
	   private String gender;
	   private double height;
	   private double weight;
	   
	   //생성자 메소드는 기본 구조로 만들어져 있다. -> 자동 생략
	   
	   //생성자 메소드의 구조
	   //리턴 타입X -> void x
	   
	   //기본 생성자의 구조
	   public Human() {    
		   
	   }
	   
	   // 같은 이름의 메소드이지만 서로 다른 역할을 하는 메소드 -> 메소드 오버로딩(중복정의)
	   public Human(String name, int age, String gender, double height, double weight) {
	       //this 키워드는 설계도가 원래 가지고 있던 필드를 가르킨다      
		    this.name = name; // 설계도 네임//필요한네임 가져오자
		    this.age = age;
		    this.gender = gender;
		    this.height = height;
		    this.weight = weight;
	}
	   
	   public Human(String name, int age, String gender) {
	       //this 키워드는 설계도가 원래 가지고 있던 필드를 가르킨다      
		    this.name = name; // 설계도 네임  //필요한네임 가져오자
		    this.age = age;
		    this.gender = gender;
		    this.height = height;
		    this.weight = weight;
	}
	   
	   
	//행동
	   public void walk() {
		   System.out.println("걷는다!");
	   }
	   public void smile() {
		   System.out.println("스마일~!");
	   }
	   public void talk() {
		   System.out.println("말하다!");
	   }
	   
	   //외부로 부터 넘어온 데이터 값을 설계도에 연결해 줄 수 있는 메소드 생성!
	   //값을 다시 설정할 수 있는 기능 -> setter
	   
	   public void setAge(int age) {
		   this.age = age;
	   }
	   
	   // 설계도에 저장된 데이터 값을 가지고 올 수 있는 메소드 생성!
	   // getter
	public int getAge() {
		   return this.age;
	   }
	//getter/setter 메소드 만드는 단축키 -> alt+shift+s

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
