package Java0927;

public class ex_array4 {

	public static void main(String[] args) {
int[] starcount = {3, 4, 4, 2 ,1};
		
		// 3 -> 1, 2, 3
		// 4 -> 1, 2, 3, 4
		
		// 방 돌아다니기
		for(int i = 0; i<starcount.length; i++) {
			// i -> 3
			System.out.print(starcount[i] + " : ");
			
			for(int j = 1; j <=starcount[i]; j++) {
				System.out.print("*");
			}
           System.out.println();
	}

	}

}
