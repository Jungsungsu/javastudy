
public class Test {

	public static void main(String[] args) {
		
		//아래 정의하실때
		//클래스명 변수명 = new 클래스명(); --> 클래스명은 동일해야 해요~!
		Mymath math = new Mymath();
		
		//클래스 내 정의된 메소드를 접근할 때는 마침표(.)로 접근!
		//객체명.메소드명
		int result = math.cal(5, 5, '+');
        System.out.println(result);
	}

}
