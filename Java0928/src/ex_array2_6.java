import java.util.Arrays;
import java.util.Random;

public class ex_array2_6 {

	public static void main(String[] args) {

		Random rd = new Random();

		// 배열 생성
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) + 1;
		}
		System.out.println("원본 : " + Arrays.toString(array));
		// 선택정렬 진행하기
		// for(int i = 0; i<array.length-1; i++) {
		//
		// int max = i;
		//
		// for(int j = i+1; j<array.length; j++) {
		// if(array[max] < array[j]) {
		// max = j;
		// }// if문 끝
		// } // 작은 for문 끝
		// int temp = array[i];
		// array[i] = array[max];
		// array[max] = temp;
		// } //가장 큰 for문 끝

		// 버블정렬
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("결과 : " + Arrays.toString(array));

	}

}
