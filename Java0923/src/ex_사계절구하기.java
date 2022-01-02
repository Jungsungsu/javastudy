import java.util.Scanner;

public class ex_사계절구하기 {

	public static void main(String[] args) {
		
		// 12, 1, 2 -> 겨울
		// 3, 4, 5 -> 봄 ->1
		// 6, 7, 8 -> 여름 ->2
		// 9, 10, 11 -> 가을 ->3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month/3) {
		case 1:
			System.out.println(month + "월은 봄입니다!");
			break;
			
		case 2:
			System.out.println(month + "월은 여름입니다!");
			break;
			
		case 3:
			System.out.println(month + "월은 가을입니다!");
			break;
		default:
			System.out.println(month + "월은 겨울입니다!");
			break;
			
				
		}
		
		
		

	}

}
