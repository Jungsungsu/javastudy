package Java0930_03;

public class Main {

	public static void main(String[] args) {
		// Student 객체 2개 생성
				Student student1 = new Student();

				// set메소드를 이용해서 student1객체 초기화
				student1.setName("홍길동");
				student1.setNumber("20150675");
				student1.setAge(22);
				student1.setScoreJava(50);
				student1.setScoreWeb(89);
				student1.setScoreAndroid(77);

				// 사용자정의생성자를 이용해서 student2 객체 초기화
				Student student2 = new Student("김영희", "20090541", 29, 90, 25, 30);
		        
//				//student1객체의 정보를 출력
//				student1.show();
//				System.out.println("==============================");
//				student2.show();
				System.out.println(student1);
				System.out.println("==============================");
				System.out.println(student2);

	}

}
