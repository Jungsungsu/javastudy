package Java0923;

public class ex_for문7 {

	public static void main(String[] args) {
		
		//1~100까지의 숫자를 다음과 같이 출력하시오.
	   //결과) 1 -2 3 -4 5 -6 7 -8 9 -10
		
		//for(int i =1; i<101; i++) {
			//if(i%2==1) {
				//System.out.println(i);
			//}else {
				//System.out.println(i*(-1));
			//}
		 for(int i=1; i<101; i++) {
			 System.out.println((i%2==1)? i+"" : i*(-1)+"");
		}

	}

}
