package Java0927;

public class ex_array2_2 {

	public static void main(String[] args) {
		// 5행 5열 크기의 2차원 배열 array를 생성한 후, 1~25까지 데이터를 초기화하시오.
				// ex) array[0][0] = 1; array[4][4] =25;
		        int[][] array = new int[5][5];
				
				
		        int count = 1;
				
		        for(int i= 0; i<array.length; i++) {
					for(int j =0; j<array[i].length; j++) {
						array[i][j] = count;
						count+=1;
					}

				}
		        //출력
		        for(int i= 0; i<array.length; i++) {
					for(int j =0; j<array[i].length; j++) {
						System.out.print(array[i][j]+"\t");
					}
		            System.out.println();
		        }

	}

}
