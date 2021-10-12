package Java0927;

import java.util.Scanner;

public class ex_array6 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		int[] answers = {1, 4, 3, 2, 1};
		int[] inputs = new int[5];
		int total = 0;
		
		// 5개의 문제에 대한 답을 저장하는 명령문
		for(int i = 0; i<inputs.length; i++) {
			System.out.print((i+1) +"번답 >> ");
			inputs[i] = sc.nextInt();
		}
		
		//배열의 전체데이터 출력
		//System.out.println(Arrays.toString(inputs));
		
		System.out.println("==정답확인==");
		for(int i = 0; i<answers.length; i++) {
			
			//정답데이터와 입력한 데이터 비교
			if(answers[i] == inputs[i]) {
				total = total + 20; // total += 20;
				System.out.print("o");
			}else {
				System.out.print("x");
			}
			
		}    
		
		     //\' or \" : 작은따옴표 or 큰따옴표를 자료형이 아닌 문자데이터로 인식
		     //\r: 운영체제
		     //\t: tab
		     //\n: 줄바꿈 --> 이스케이프 문자
	         System.out.println("\n총점 : " + total);

	}

}
