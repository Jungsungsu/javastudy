package Java0924;

import java.util.Random;

public class ex_array3 {

	public static void main(String[] args) {
		//1.정수형 데이터를 담을 수 있는 배열 array를 선언하시오.
				int[] array;
				//2. array변수에 정수형 데이터 10개를 담을 수 있는 array를 생성하시오.
				array = new int[10];
				//3. 배열 내 1~20까지의 랜덤수로 초기화하시오.
				// Random 타입 활용
				Random ran = new Random();
				
			//	array[0] = ran.nextInt(20)+1;
			//	array[1] = ran.nextInt(20)+1;
			//	array[2] = ran.nextInt(20)+1;
			//	array[3] = ran.nextInt(20)+1;
			//	array[4] = ran.nextInt(20)+1;
			//	array[5] = ran.nextInt(20)+1;
			//	array[6] = ran.nextInt(20)+1;
		    //  array[7] = ran.nextInt(20)+1;
			//	array[8] = ran.nextInt(20)+1;
			//	array[9] = ran.nextInt(20)+1;
				
				for(int i=0; i<array.length; i++) {
					array[i] = ran.nextInt(20)+1;
				}
				
				
			
				
				
				//4. array 배열 내 모든 데이터를 반복문을 활용하여 출력하시오.		
				for(int i = 0; i<array.length; i++) {
					System.out.print(array[i] + " ");
				}
				
				//5. 4번째 인덱스의 값과 9번째 인덱스의 값을 더한 후 결과를 출력하시오.
				System.out.println(array[4] + array[9]);
				//6. 배열 내 모든 데이터를 더한 후 결과를 출력하시오.
				
				int sum = 0;
				for(int i = 0; i<array.length; i++) {
					sum += array[i];
				}
				System.out.println("배열 내 모든 데이터의 총합 : " + sum);
	}

}
