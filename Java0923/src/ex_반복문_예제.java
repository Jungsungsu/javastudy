import java.util.Scanner;

public class ex_�ݺ���_���� {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		
	    while(true) {
			System.out.print("A �Է� : ");
			int num1 = sc.nextInt();
			
			System.out.print("B �Է� : ");
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				break;
			}
			System.out.print("��� >> " + (num1-num2));
		}


	}

}
