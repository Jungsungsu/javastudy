import java.util.Random;
import java.util.Scanner;

public class ex_method_1 {

	public static void main(String[] args) {

	// 메소드 1

	// 메소드 호출 = 실행한다;
		hello();
		
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();  // 매개변수X 리턴값O
		System.out.println(msg);
		
		Random ran = new Random();
		ran.nextInt(5);
		
	}
	// 메소드 구조 - 매개변수X 리턴값X
	// 접근제한자 리턴타입(반환 자료형) 메소드이름(매개변수1, 매개변수2, 매개변수3, ...) {}

	public static void hello() {
		System.out.println(true);
	}
}
