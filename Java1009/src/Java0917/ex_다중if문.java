package Java0917;

import java.util.Scanner;

public class ex_����if�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("���� : ");
		int grade = sc.nextInt();
		
	    String result = "";
		
		if(grade >= 90) {
			//System.out.println("A�����Դϴ�.");
			result = "A";
		}else if(grade >= 80 && grade <= 90) {
			//System.out.println("B�����Դϴ�.");
			result = "B";
		}else if(grade >=70 && grade <= 80) {
			//System.out.println("C�����Դϴ�.");
			result = "C";
		}else {
			//System.out.println("D�����Դϴ�...");
			result = "D";
		}
		
		System.out.println(result + "���� �Դϴ�.");
		

	}

}
