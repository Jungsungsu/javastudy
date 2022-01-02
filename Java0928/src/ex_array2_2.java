import java.util.Arrays;

public class ex_array2_2 {

	public static void main(String[] args) {

		// 선택정렬

		int[] array = { 7, 98, 13, 70, 24 }; // 5

		// 여러 스탭이 진행될 수 있도록 가장 큰 for문을 만들어 준다
		for (int j = 0; j < array.length - 1; j++) { // j=0; 0 < 5-1 = 4; j++

			// 배열 중 가장 큰수의 위치값을 기억할 수 있는 변수 생성
			int max = j; // 0

			// 가장 큰 수를 찾을 수 있는 알고리즘
			for (int i = j + 1; i < array.length; i++) { // i = 1; 1<7; i++
				if (array[max] < array[i]) { // max 1>7 , max 7<98 // 부등호만 바꿔주면 순서,역순 바꿀 수 있음!
					max = i; // max 1 = 7, max 98 = 7
				}
			}

			// 큰 수를 찾고 나서 치환해서 값 변경해 주기
			int temp = array[j];
			array[j] = array[max];
			array[max] = temp;

		}
		System.out.println(Arrays.toString(array));

	}

}
