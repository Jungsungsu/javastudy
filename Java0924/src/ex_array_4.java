import java.util.Random;

public class ex_array_4 {

	public static void main(String[] args) {
        
		//1. 5개의 숫자를 저장할 수 있는 정수형 배열 array를 선언&생성하시오.
		
		int[] array;
		
		array = new int[5];
		
		//2. array배열 내 임의의 값을 초기화하시오.
		
		Random ran = new Random();
		
		for(int i=0; i<array.length; i++) {
			array[i] = ran.nextInt(10)+1;
		}
		
		//3. 배열 내 짝수 값만 출력하시오.
		// 결과) array에 들어있는 짝수는 ________ 입니다.
		
		System.out.print("array에 들어있는 짝수는 ");
		
		for(int i= 0; i<array.length; i++) {
		   if(array[i]%2==0) {
				System.out.print(array[i] + " ");
		   }
		}
		  System.out.print(" 입니다.");
	}
	
}
	

