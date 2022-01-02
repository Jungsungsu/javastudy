
public class ex_array2_7 {

	public static void main(String[] args) {

		// 2차원 배열 복습

		// 2차원 배열 생성(정수형)
		int[][] array = new int[5][5];

		int cnt = 1;

		for (int row = 0; row < array.length; row++) {
			for (int i = 0; i < array[row].length; i++) {
				array[row][i] = cnt++;
			}
		}

		// 출력
		for (int row = 0; row < array.length; row++) {
			for (int i = 0; i < array[row].length; i++) {
				System.out.print(array[row][i] + "\t");
			}
			System.out.println();
		}
        // array[0][0] = cnt++;
		// array[0][1] = cnt++;
		// array[0][2] = cnt++;
		// array[0][3] = cnt++;
		// array[0][4] = cnt++;

		// array[1][0] = cnt++;
		// array[1][1] = cnt++;
		// array[1][2] = cnt++;
		// array[1][3] = cnt++;
		// array[1][4] = cnt++;

		// for(int i =0; i<array[1].length; i++) {
		// array[1][i] = cnt++;
		// }
		// for(int i =0; i<array[0].length; i++) {
		// array[2][i] = cnt++;
		// }
		// for(int i =0; i<array[0].length; i++) {
		// array[3][i] = cnt++;
		// }
		// for(int i =0; i<array[0].length; i++) {
		// array[3][i] = cnt++;
	}

}
