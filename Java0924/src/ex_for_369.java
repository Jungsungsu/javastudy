
public class ex_for_369 {

	public static void main(String[] args) {
		
		// 1~50 까지 3,6,9
		
		
		for(int i = 1; i <= 50; i++) {
			// ~이면서 : and 연산자 (&&)
			// ~이거나, 혹은 : or 연산자 (||)
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.println("박수");
			}else if(i%10 == 5) {
				System.out.println("으악");
			}else {
				System.out.println(i);
			}
		}
		
		
		

	}

}
