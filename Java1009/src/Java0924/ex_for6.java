package Java0924;

public class ex_for6 {

	public static void main(String[] args) {
		for(int i = 1; i<= 5; i++) {
			// 공백을 만들수 있는 for문
		for(int j = 5; j > i; j--) {
		     System.out.print("");
			 
				}
		//별을 만들수 있는 for문
		for(int k = 1; k <= i; k++) {
			System.out.print("*");
		}
		     
		}

		
		System.out.println();

	}

}
