import java.util.Random;

public class ex_method_5 {

	public static void main(String[] args) {
		
		//������
		//2�� 3��: 2*2*2
		
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.print("��� Ȯ��: " + result);

	}
        // �巡�� ������
	    private static int powerN(int base, int n) {
		
		//return (int) Math.pow(base, n);
		
		int result = 1;
				
		for(int i=0; i<n; i++) {
		 result = result*base;   // result*= base;
		}
		return result;
	}
	    //�巡�� ����

	
	
}
