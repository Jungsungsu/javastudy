import java.util.Scanner;

public class ex_swhich�� {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
		 System.out.print("���� �Է� : ");
	     int grade = sc.nextInt();
			
	     // 10, 20, 30
		 switch(grade) {
		 case 10:
			 System.out.println("C���� �Դϴ�");
			 break;
			 
		 case 20:
			 System.out.println("B���� �Դϴ�");
			 break;
		 case 30:
			 System.out.println("A���� �Դϴ�");
			 break;
			 
		 default:
			 System.out.println("F���� �Դϴ�..");
		     break;
		 }

	}

}
