package Java0923;

public class ex_for문6 {

	public static void main(String[] args) {
		//1~100까지의 숫자의 합을 출력하시오.
				int sum = 0;
				
				for(int i = 1; i<101; i++) {
					sum = sum + i; // sum +=i;
				}
				System.out.println("1~100까지의 합 : " + sum);
				

	}

}
