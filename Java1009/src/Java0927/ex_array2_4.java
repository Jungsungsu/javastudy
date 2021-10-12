package Java0927;

public class ex_array2_4 {

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
					
					if(i%2 == 0) {
						System.out.print(array[i][j]+"\t");
					}else {
						System.out.print(array[i][4-j]+"\t");
					}
				}
	            System.out.println();
	        }

	}

}
