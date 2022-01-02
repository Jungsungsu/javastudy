
public class ex_method_1 {

	public static void main(String[] args) {
		
		int n1 =5;
		int n2 =10;
		
		int result = addNumber(n1,n2);   //call by value
		System.out.println("두 수의 합:" +result);

	}

	public static int addNumber(int num1, int num2) {
	int result = num1 + num2;
	return result;
		
		//return num1 + num2;
		}
}
