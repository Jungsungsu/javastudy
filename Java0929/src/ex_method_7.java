
public class ex_method_7 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = {11,12,13,14,15};
		// array배열에 저장된 모든 데이터를 출력하는 arrayToString() 메소드를
		// 구현하시오.
        // 메소드 생성방법
        //1. 코드선택 -> 오른쪽 클릭 -> 3.Refactor ->4.Extract Method
        //5.Method name 변경
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
