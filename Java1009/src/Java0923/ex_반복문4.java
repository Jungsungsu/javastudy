package Java0923;

import java.util.Random;
import java.util.Scanner;

public class ex_반복문4 {

	public static void main(String[] args) {
		// 랜덤수 생성하기
				Random rd = new Random();
				
				Scanner sc = new Scanner(System.in);
				
				while(true) {
				
				  int num1 = rd.nextInt(5)+1;
				  int num2 = rd.nextInt(5)+1;
				
				  System.out.print(num1 + "+" + num2 + "=");
				  int result = sc.nextInt();
				
				  if(result == (num1+num2)) {
					System.out.println("정답입니다!");
				  }else {
					System.out.println("틀렸습니다..");
				  }
				  
				  System.out.print("계속 하시겠습니까? >> ");
				  String ans = sc.next();
				  
				  if(ans.equals("n") || ans.equals("N")) {
					  System.out.println("종료 되었습니다.");
					  break;
				  }
				}//while 끝

	}

}
