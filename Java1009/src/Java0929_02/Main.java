package Java0929_02;

public class Main {

	public static void main(String[] args) {
		// Class: 새로운 자료형
				// Human클래스를 이용하여 Human객체 생성

				// 참조(레퍼런스) //객체변수

				// 객체 생성시 new 라는 키워드를 사용해야 한다!
				Human human = new Human(); // 메소드를 찾을수 없음

				// human이 가질 수 있는 속성값을 저장하기!
//				human.name = "정성수";
//				human.age = 27;
//				human.gender = "남자";
//				human.height = 173.0;
//				human.weight = 62.0;

//				System.out.println("Human의 이름 : " + human.name);
//				System.out.println("Human의 나이 : " + human.age);
//				System.out.println("Human의 성별 : " + human.gender);
//				System.out.println("Human의 키 : " + human.height);
//				System.out.println("Human의 몸무게 : " + human.weight);

				// 설계도를 사용하여 또다른 사람을 만들어보자!
				Human human2 = new Human(); // 객체만들기+ 생성자 메소드
				human2.setName("최성우");  //속성 만들기
				human2.setAge(28);
				human2.setGender("남자");
				human2.setHeight(180.0);
				human2.setWeight(70.0);
		        
				
				//<이론>
				// 객체를 생성할때 마다 속성을 여러번 넣어줘야 하는게 불편하다!
				// -> 객체를 생성할 때 부터 속성값을 부여해 주자! -> 생성자 메소드

				// 생성자 메소드
				// new라는 키워드가 사용되면 자동으로 생성되는 메소드

				// -생성자의 특징
				// 1.생성자는 메소드이다
				// 2.생성자 이름은 클래스 이름과 동일
				// 3.생성자는 리턴 타입을 지정할 수 없다.
				// 4.생성자는 new를 통해 객체를 생성할 때만 호출됨
				// 5.생성자는 하나 이상 선언되어야 함
				// 6. !개발자가 생성자를 정의하지 않으면 자동으로 기본 생성자가 정의됨
				// 컴파일러에 의해 자동생성
				// 기본 생성자를 !디폴트 생성자 라고도함
				// 만약 default 생성자만 존재하고 default에 아무런 기능이 없을 경우 !생략이 가능함

				// ex)생성자 메소드 생성, 클래스 만들때 설명
				// 붕어빵 틀 class -> 붕어빵
				// ->붕어빵을 만들때 팥을 넣을수 있는 메소드
				// ->붕어빵 만들때 슈를 넣을 수 있는 메소드

				// 저금통 클래스
				// 저금통클래스
				// 속성(필드)
				// 금액
				// 기능(메소드)
				// 돈을 넣는다
				// 돈을 인출한다
				// 잔액을 보여준다

				// 붕어빵 틀 붕어빵1 = new 붕어빵 틀("팥");
				// ->팥소를 가지고 있는 붕어빵!

				// 붕어빵1.소= "팥";

				// 붕어빵 틀 붕어빵2=new 붕어빵 틀("슈");

				Human human3 = new Human("임명진", 28, "남자", 180.0, 70.0);

				System.out.println(human3.getAge());
				System.out.println(human3.getGender());
			

				Human human4 = new Human("정성수", 27, "남자");


		        
				
				human4.setAge(26);
				System.out.println("human4의 이름 : " + human4.getAge());


	}

}
