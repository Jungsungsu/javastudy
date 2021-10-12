package Java0927;

import java.util.Scanner;

public class ex_array2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		// 사용자로부터 입력값을 받아 배열에 저장하기!
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i + 1) + "번째 입력>> "+ "");
			 arr[i] = sc.nextInt();
			
		}
		
		System.out.print("입력된 점수 : ");
	
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
