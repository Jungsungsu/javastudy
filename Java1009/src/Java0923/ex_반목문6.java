package Java0923;

import java.util.Scanner;

public class ex_반목문6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
        int a = 0;
        int b = 0;
        int num = 0;
        
        while(num!=-1) {
        	System.out.print("숫자 입력 : ");
        	num = sc.nextInt();
        	
        	if(num==-1) {
        		System.out.println("종료되었습니다...");
        	}else {
        		if(num%2==0) {
        			a++;
        		}else {
        			b++;
        		}
        		System.out.println("짝수 : " + a);
        		System.out.println("홀수 : " + b);
        	}
        }
	}

}
