import java.util.Arrays;

public class ex_array2_2 {

	public static void main(String[] args) {

		// ��������

		int[] array = { 7, 98, 13, 70, 24 }; // 5

		// ���� ������ ����� �� �ֵ��� ���� ū for���� ����� �ش�
		for (int j = 0; j < array.length - 1; j++) { // j=0; 0 < 5-1 = 4; j++

			// �迭 �� ���� ū���� ��ġ���� ����� �� �ִ� ���� ����
			int max = j; // 0

			// ���� ū ���� ã�� �� �ִ� �˰���
			for (int i = j + 1; i < array.length; i++) { // i = 1; 1<7; i++
				if (array[max] < array[i]) { // max 1>7 , max 7<98 // �ε�ȣ�� �ٲ��ָ� ����,���� �ٲ� �� ����!
					max = i; // max 1 = 7, max 98 = 7
				}
			}

			// ū ���� ã�� ���� ġȯ�ؼ� �� ������ �ֱ�
			int temp = array[j];
			array[j] = array[max];
			array[max] = temp;

		}
		System.out.println(Arrays.toString(array));

	}

}
