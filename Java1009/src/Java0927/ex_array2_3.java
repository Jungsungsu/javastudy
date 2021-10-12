package Java0927;

public class ex_array2_3 {

	public static void main(String[] args) {
		  int[][] array = new int[5][5];
			
			
	        int count = 21;
			
	        for(int i= 0; i<array.length; i++) {
				for(int j =0; j<array[i].length; j++) {
					array[i][j] = count;
					count+=1;
				}

			}
	        
	        for(int i= 0; i<array.length; i++) {
				for(int j =0; j<array[i].length; j++) {
					System.out.print(array[i][j]+"\t");
					}
	            System.out.println();
	        }

	}

}
