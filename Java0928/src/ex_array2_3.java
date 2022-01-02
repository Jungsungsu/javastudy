
public class ex_array2_3 {

	public static void main(String[] args) {

		// 순차 탐색
		int[] array = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		int search = 78;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {
				System.out.println("찾고자 하는 값의 위치는 " + (i + 1) + "번째 입니다.");
			}
		}

	}

}
