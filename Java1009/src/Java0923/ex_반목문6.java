package Java0923;

import java.util.Scanner;

public class ex_�ݸ�6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
        int a = 0;
        int b = 0;
        int num = 0;
        
        while(num!=-1) {
        	System.out.print("���� �Է� : ");
        	num = sc.nextInt();
        	
        	if(num==-1) {
        		System.out.println("����Ǿ����ϴ�...");
        	}else {
        		if(num%2==0) {
        			a++;
        		}else {
        			b++;
        		}
        		System.out.println("¦�� : " + a);
        		System.out.println("Ȧ�� : " + b);
        	}
        }
	}

}
