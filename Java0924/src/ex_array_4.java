import java.util.Random;

public class ex_array_4 {

	public static void main(String[] args) {
        
		//1. 5���� ���ڸ� ������ �� �ִ� ������ �迭 array�� ����&�����Ͻÿ�.
		
		int[] array;
		
		array = new int[5];
		
		//2. array�迭 �� ������ ���� �ʱ�ȭ�Ͻÿ�.
		
		Random ran = new Random();
		
		for(int i=0; i<array.length; i++) {
			array[i] = ran.nextInt(10)+1;
		}
		
		//3. �迭 �� ¦�� ���� ����Ͻÿ�.
		// ���) array�� ����ִ� ¦���� ________ �Դϴ�.
		
		System.out.print("array�� ����ִ� ¦���� ");
		
		for(int i= 0; i<array.length; i++) {
		   if(array[i]%2==0) {
				System.out.print(array[i] + " ");
		   }
		}
		  System.out.print(" �Դϴ�.");
	}
	
}
	

