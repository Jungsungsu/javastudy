package Java0929;

public class ex_메소드5 {

	public static void main(String[] args) {
		//제곱근
				//2의 3승: 2*2*2
				
				int base = 2;
				int n = 3;
				int result = powerN(base, n);
				System.out.print("결과 확인: " + result);

			}
		        // 드래그 시작점
			    private static int powerN(int base, int n) {
				
				//return (int) Math.pow(base, n);
				
				int result = 1;
						
				for(int i=0; i<n; i++) {
				 result = result*base;   // result*= base;
				}
				return result;
			}
			    //드래그 끝점

	}


