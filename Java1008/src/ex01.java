import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		result = "";
		
		System.out.print("A �Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("B �Է�>> ");
		int num2 = sc.nextInt();
		
		
	
		if(num1,num2 == 0) {
			result = "1";
		}else {
			result = "-1";
		}
		System.out.println("��� �Է� : " + result);

	}

}
