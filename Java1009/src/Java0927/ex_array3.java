package Java0927;

import java.util.Scanner;

public class ex_array3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 수박 게임 Start! ====");
		
		// 배열의 크기는 요소값의 갯수만큼 정해진다.
		String[] array = {"수","박"};
		
		
		System.out.print("숫자를 입력해주세요>>");
		int num = sc.nextInt();
		
		// 홀수 -> 수
		// 짝수 -> 박
		for(int i = 1; i<=num; i ++)
			if(i%2 == 0) {
				System.out.print(array[1]);
			}else {
				System.out.print(array[0]);
			}
		 System.out.println();

	}

}
