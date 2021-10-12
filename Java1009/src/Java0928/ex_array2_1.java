package Java0928;

import java.util.Arrays;

public class ex_array2_1 {

	public static void main(String[] args) {
		// 버블정렬

				int[] array = { 45, 7, 12, 82, 25 };

				// 1step -> [0],[1] [1],[2] [2],[3] [3],[4]

				// 2step -> [0],[1] [1],[2] [2],[3]

				// 3step -> [0],[1] [1],[2]

				// 4step -> [0],[1]

				// 자동 정렬 -> 전체선택 -> ctrl + shift + F

				for (int j = 0; j < array.length - 1; j++) {
					for (int i = 0; i < array.length - 1; i++) {
						if (array[i] > array[i + 1]) { // 7>45
							// 큰수를 뒤로 보내주기 위해 치환 사용하기
							int temp = array[i]; // 7
							array[i] = array[i + 1]; // 45
							array[i + 1] = temp; // 7
						} // if문 끝

					} // 작은 for문 끝

				} // 큰 for문 끝

				// 자릿값이 바뀌는 결과 확인하기
				System.out.println(Arrays.toString(array));

	}

}
