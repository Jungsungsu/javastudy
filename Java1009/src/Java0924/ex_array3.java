package Java0924;

import java.util.Random;

public class ex_array3 {

	public static void main(String[] args) {
		//1.������ �����͸� ���� �� �ִ� �迭 array�� �����Ͻÿ�.
				int[] array;
				//2. array������ ������ ������ 10���� ���� �� �ִ� array�� �����Ͻÿ�.
				array = new int[10];
				//3. �迭 �� 1~20������ �������� �ʱ�ȭ�Ͻÿ�.
				// Random Ÿ�� Ȱ��
				Random ran = new Random();
				
			//	array[0] = ran.nextInt(20)+1;
			//	array[1] = ran.nextInt(20)+1;
			//	array[2] = ran.nextInt(20)+1;
			//	array[3] = ran.nextInt(20)+1;
			//	array[4] = ran.nextInt(20)+1;
			//	array[5] = ran.nextInt(20)+1;
			//	array[6] = ran.nextInt(20)+1;
		    //  array[7] = ran.nextInt(20)+1;
			//	array[8] = ran.nextInt(20)+1;
			//	array[9] = ran.nextInt(20)+1;
				
				for(int i=0; i<array.length; i++) {
					array[i] = ran.nextInt(20)+1;
				}
				
				
			
				
				
				//4. array �迭 �� ��� �����͸� �ݺ����� Ȱ���Ͽ� ����Ͻÿ�.		
				for(int i = 0; i<array.length; i++) {
					System.out.print(array[i] + " ");
				}
				
				//5. 4��° �ε����� ���� 9��° �ε����� ���� ���� �� ����� ����Ͻÿ�.
				System.out.println(array[4] + array[9]);
				//6. �迭 �� ��� �����͸� ���� �� ����� ����Ͻÿ�.
				
				int sum = 0;
				for(int i = 0; i<array.length; i++) {
					sum += array[i];
				}
				System.out.println("�迭 �� ��� �������� ���� : " + sum);
	}

}
