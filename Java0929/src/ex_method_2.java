
public class ex_method_2 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
				
	    System.out.println(cal(num1, num2, op));  //cal�� ���ٴ��

	}
    //�巡�� ������
	private static int cal(int num1, int num2, char op) {
	int result = 0;
		
		if(op == '+') {
			//return num1+num2;  //num1�ʿ� ���ٴ��
		     result = num1+ num2;
		}else if(op == '-') {
			//return num1-num2;
			result = num1-num2;
		}else if(op == '*') {
			//return num1*num2;
			result = num1*num2;
		}else if(op == '/') {
			//return num1/num2;
			result = num1/num2;
		}else {
			return 0;
		}
		return result;
		}
	   //�巡�� ��

}
