import java.util.Arrays;

public class ex_array2_5 {

	public static void main(String[] args) {

		// �迭 ����

		int[] array = { 39, 60, 25, 36, 17, 14, 13, 74, 88, 75 };

		for (int j = 0; j < array.length - 1; j++) {

			int max = j;

			for (int i = j + 1; i < array.length; i++) {
				if (array[max] < array[i]) {
					max = i;
				} // if�� ��
			} // ���� for�� ��

			int temp = array[j];
			array[j] = array[max];
			array[max] = temp;

		} // ū for�� ��
		System.out.println(Arrays.toString(array));
	}

}
