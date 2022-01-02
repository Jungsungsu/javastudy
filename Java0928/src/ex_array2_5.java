import java.util.Arrays;

public class ex_array2_5 {

	public static void main(String[] args) {

		// 배열 생성

		int[] array = { 39, 60, 25, 36, 17, 14, 13, 74, 88, 75 };

		for (int j = 0; j < array.length - 1; j++) {

			int max = j;

			for (int i = j + 1; i < array.length; i++) {
				if (array[max] < array[i]) {
					max = i;
				} // if문 끝
			} // 작은 for문 끝

			int temp = array[j];
			array[j] = array[max];
			array[max] = temp;

		} // 큰 for문 끝
		System.out.println(Arrays.toString(array));
	}

}
