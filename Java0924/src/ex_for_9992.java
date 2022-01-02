import java.util.Scanner;

public class ex_for_9992 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("╢э ют╥б : ");
		
		int dan = sc.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

	}

}
