
public class ex_method_7 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = {11,12,13,14,15};
		// array�迭�� ����� ��� �����͸� ����ϴ� arrayToString() �޼ҵ带
		// �����Ͻÿ�.
        // �޼ҵ� �������
        //1. �ڵ弱�� -> ������ Ŭ�� -> 3.Refactor ->4.Extract Method
        //5.Method name ����
		arrayToString(array);
		arrayToString(array2);

	}

	public static void arrayToString(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
