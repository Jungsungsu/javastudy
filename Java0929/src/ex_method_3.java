
public class ex_method_3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = LargerNumbers(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}
       //드래그 시작점
	    public static int LargerNumbers(int num1,int num2) {
    	
    	if(num1 > num2) { //num1이 큰 경우
    		return num1;
    	}else if (num1 < num2) { //num2가 큰 경우
    		return num2;
    	}else { // 두 수가 동일한 경우
    		return 0;
    	}
    	
    }
         // 드래그 끝
}
