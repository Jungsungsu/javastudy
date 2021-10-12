package Java0924;

public class ex_for4 {

	public static void main(String[] args) {
		//for(int i = 1; i<= 5; i++) {
				//	for( i = *; * <= ******; *++) {
					//System.out.print((char)* + "*" + (char)* );
				//}
				//System.out.println();
				
				
				//라인을 돌려줄수 있는 for문
				for(int i = 1; i<= 5; i++) {
					//별을 그려줄수 있는 for문
					for(int j = 1; j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

	}

}
