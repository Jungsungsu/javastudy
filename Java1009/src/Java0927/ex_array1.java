package Java0927;

import java.util.Random;

public class ex_array1 {

	public static void main(String[] args) {
		// 1. 1���� �迭 (ũ�� 5) �����ϱ�
		  int[] arr = new int[5];
		// 2. ������ �迭�� ���� ���� �����ϱ�
		  Random ran = new Random();
		    
		    for(int i = 0; i<arr.length; i++) {
		    	arr[i] = ran.nextInt(20)+1;
		    
		    	System.out.print(arr[i] + " "); 
		    }
		// 3. ������ ���� ���Ͽ� ���� ū �� ã�Ƴ���!
	    
		// ������ ���� ���Ҽ� �ִ� ���� �ʿ�!
		    
		// ���� ū ���� ����� �� �ִ� ���� ����!
		   int max = arr[0];
		 
		// ���� ���� �� ����ϱ�
		   int min = arr[0];
		   
		   for(int i = 0; i < arr.length; i++) {
			   if(max < arr[i]) {
				   max = arr[i];
			   }else if(min>arr[i]) {
				   min = arr[i];
			   }
		   }
      System.out.println();
	    System.out.println("���� ū �� : " + max);
	    System.out.println("���� ���� �� : " + min);

	}

}
