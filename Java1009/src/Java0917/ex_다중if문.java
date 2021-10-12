package Java0917;

import java.util.Scanner;

public class ex_다중if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("학점 : ");
		int grade = sc.nextInt();
		
	    String result = "";
		
		if(grade >= 90) {
			//System.out.println("A학점입니다.");
			result = "A";
		}else if(grade >= 80 && grade <= 90) {
			//System.out.println("B학점입니다.");
			result = "B";
		}else if(grade >=70 && grade <= 80) {
			//System.out.println("C학점입니다.");
			result = "C";
		}else {
			//System.out.println("D학점입니다...");
			result = "D";
		}
		
		System.out.println(result + "학점 입니다.");
		

	}

}
