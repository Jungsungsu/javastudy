package Java0928;

public class ex_array2_4 {

	public static void main(String[] args) {

		// 이진탐색

		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		// 가장 작고, 큰 인덱스를 기억할 수 있는 변수 생성!
		int low = 0;
		int hight = array.length - 1; // 9

		int search = 78;

		// 몇번째에 찾고자 하는 수를 찾을지 모름 -> while

		while (true) {

			// 배열의 중간 위치를 찾을 수 있는 변수 생성
			int middle = (low + hight) / 2; // (0+10) / 2

			if (array[middle] == search) {
				System.out.println("찾고자 하는 값의 위치는 " + (middle + 1) + "번째 입니다");
				break;
			}
			// 훨씬 숫자가 작을때
			else if (array[middle] < search) {
				low = middle + 1;
			}
			// 훨씬 숫자가 클때
			else if (array[middle] > search) {
				hight = middle - 1;
			}
		}

	}

}
