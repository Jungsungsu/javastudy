import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//인형을 뽑을 수 있는 인형 뽑기 기계 만들기!
		// -> 상속, 다형성, 업캐스팅
		
		// 각각의 기계에서 인형을 뽑을 수 있도록 만들어 보자!
		// 1.인형 클래스 -> 무민(moomin), 옴팡이(ohmpangE), 라이언(ryan), 짱구(jjanggo)
		//              - 각 인형의 클래스 안에는 해당 인형의 이름으로 메소드 생성하기
		//              - ex) moomin class -> public void moomin() {
		//                        system.out.println("무민 인형 등장!")
		//                    };
	
		// 2. 기계 클래스 -> Machine 클래스 -> 각각의 인형을 뽑을수 있는 pic(짱구) 생성 - 오버로딩
		
		// Machine 객체 생성하기
		Machine m = new Machine();	
		
		//각 인형의 객체 생성하기
//		Moomin moomin = new Moomin();
//		OhmpangE ohmpangE = new OhmpangE();
//		Ryan ryan = new Ryan();
//		Jjanggo jjanggo = new Jjanggo();
//		
		
//		m.pic(moomin);
//		m.pic(ohmpangE);
//		m.pic(ryan);
//		m.pic(jjanggo);
		
		
		//업캐스팅 활용하기
		Doll d1 = new Jjanggo();
		Doll d2 = new Moomin();
		Doll d3 = new Ryan();
		Doll d4 = new OhmpangE();
		
//		m.pic(d1);
//		m.pic(d2);
//		m.pic(d3);
//		m.pic(d4);
		
		//랜덤으로 인형 뽑기 만들어 보기!
		//옴팡이,무민,짱구,라이언 -> 인형(doll)
		Doll[] dolls = {d1, d2, d3, d4};
		
		// 랜덤으로 인형을 뽑을 수 있도록 만들어 주기!
		// 1. 랜덤수 생성하기
	    Random rd = new Random();
	    int num = rd.nextInt(4); // 0~3 사이의 랜덤수 생성
	    
	    System.out.println();
	    System.out.println("랜덤으로 인형 뽑아주기!");
	    
	    //인형 뽑기 기계에 랜덤으로 생성된 인형의 값을 매개변수 값으로 넣어준다!
	    m.pic(dolls[num]);
		
		

	}

}
