import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int num = sc.nextInt();
		
		
		
		int result;
		
		for(int i =0; i<9; i++) {
			num = sc.nextInt();
			i = num + num;
			i++;
		
		System.out.print("����" + i + "�Դϴ�.");
		}
				
				
		
		
		
		
        
		
	}

}
