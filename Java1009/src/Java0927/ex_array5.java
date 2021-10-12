package Java0927;

import java.util.Scanner;

public class ex_array5 {

	public static void main(String[] args) {
		
		//1. 10개의 공간을 가진 문자열 배열 name을 초기화하시오.
		String[] names = {"공유","김무열","이지아","이동욱","이제훈","이문세",
				         "스칼렛 요한슨","이정재","송강호","이민기"};
		//2. 이름을 입력했을 때 name배열 내 몇 번째 위치에 있는지 출력하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 배우의 이름을 작성해주세요: ");
		
		String name = sc.nextLine();
		
		for(int i = 0; i<names.length; i++) {
			
			if(name.equals(names[i])) {
				System.out.println(name + "의 위치는 " + (i+1) + "번째입니다.");
				break;  // 동일한 이름을 찾았을 때 더 이상 반복하지 않도록 break문 작성
				        
			}
			
			
		}
		

	}

}
