import java.util.Arrays;
import java.util.Random;

public class ex_array2_6 {

	public static void main(String[] args) {

		Random rd = new Random();

		// �迭 ����
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(100) + 1;
		}
		System.out.println("���� : " + Arrays.toString(array));
		// �������� �����ϱ�
		// for(int i = 0; i<array.length-1; i++) {
		//
		// int max = i;
		//
		// for(int j = i+1; j<array.length; j++) {
		// if(array[max] < array[j]) {
		// max = j;
		// }// if�� ��
		// } // ���� for�� ��
		// int temp = array[i];
		// array[i] = array[max];
		// array[max] = temp;
		// } //���� ū for�� ��

		// ��������
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("��� : " + Arrays.toString(array));

	}

}
