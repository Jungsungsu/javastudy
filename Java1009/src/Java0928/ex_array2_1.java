package Java0928;

import java.util.Arrays;

public class ex_array2_1 {

	public static void main(String[] args) {
		// ��������

				int[] array = { 45, 7, 12, 82, 25 };

				// 1step -> [0],[1] [1],[2] [2],[3] [3],[4]

				// 2step -> [0],[1] [1],[2] [2],[3]

				// 3step -> [0],[1] [1],[2]

				// 4step -> [0],[1]

				// �ڵ� ���� -> ��ü���� -> ctrl + shift + F

				for (int j = 0; j < array.length - 1; j++) {
					for (int i = 0; i < array.length - 1; i++) {
						if (array[i] > array[i + 1]) { // 7>45
							// ū���� �ڷ� �����ֱ� ���� ġȯ ����ϱ�
							int temp = array[i]; // 7
							array[i] = array[i + 1]; // 45
							array[i + 1] = temp; // 7
						} // if�� ��

					} // ���� for�� ��

				} // ū for�� ��

				// �ڸ����� �ٲ�� ��� Ȯ���ϱ�
				System.out.println(Arrays.toString(array));

	}

}
