package Java0928;

public class ex_array2_4 {

	public static void main(String[] args) {

		// ����Ž��

		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		// ���� �۰�, ū �ε����� ����� �� �ִ� ���� ����!
		int low = 0;
		int hight = array.length - 1; // 9

		int search = 78;

		// ���°�� ã���� �ϴ� ���� ã���� �� -> while

		while (true) {

			// �迭�� �߰� ��ġ�� ã�� �� �ִ� ���� ����
			int middle = (low + hight) / 2; // (0+10) / 2

			if (array[middle] == search) {
				System.out.println("ã���� �ϴ� ���� ��ġ�� " + (middle + 1) + "��° �Դϴ�");
				break;
			}
			// �ξ� ���ڰ� ������
			else if (array[middle] < search) {
				low = middle + 1;
			}
			// �ξ� ���ڰ� Ŭ��
			else if (array[middle] > search) {
				hight = middle - 1;
			}
		}

	}

}
