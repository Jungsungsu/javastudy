import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		result = "";
		
		System.out.print("A 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("B 입력>> ");
		int num2 = sc.nextInt();
		
		
	
		if(num1,num2 == 0) {
			result = "1";
		}else {
			result = "-1";
		}
		System.out.println("결과 입력 : " + result);

	}

}
