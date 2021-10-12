package Java0927;

public class ex_array2_5 {

	public static void main(String[] args) {
int[][] array = new int[5][5];
		
		int count = 21;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				array[i][j] = count;
				count+=1;
				}
		}
		
		
        for(int i= 0; i<array.length; i++) {
			for(int j =0; j<array[i].length; j++) {
				
				
				//col과 row의 위치만 변경!
				System.out.print(array[j][i]+"\t");
			}
            System.out.println();
        }

	}

}
