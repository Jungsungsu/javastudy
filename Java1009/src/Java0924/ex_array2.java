package Java0924;

public class ex_array2 {

	public static void main(String[] args) {
		//Call by value
		int num = 5;
		int num2 = num; // num�� ����� 5��� �����͸� num2�� �����Ͽ� ����
		
		System.out.println(num);
		System.out.println(num2);
		
		//Call by reference
		int[] numbers = new int[2];
		//numbers2���� numbers�� �����ϰ� �ִ� �迭�� �ּҰ��� ����
		//��, numbers�� numbers2�� ���� �迭�� �ּҰ��� ����
		int[] numbers2 = numbers;
		
		System.out.println(numbers);
		System.out.println(numbers2);
		
		numbers[0] = 1;
		
		//0��° ��ġ�� �� ����
		System.out.println(numbers[0]);
		System.out.println(numbers2[0]);
		
		numbers2[1] = 5;
		System.out.println(numbers2[1]);
		System.out.println(numbers[1]);
		

	}

}
