package Java0929;

public class ex_�޼ҵ�4 {

	public static void main(String[] args) {
		int num1 = 11;
		int num2 = 5;
		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}
        // �巡�� ������
	    private static int close10(int num1, int num2) {


		
		int n1 = Math.abs(10-num1);
		int n2 = Math.abs(10-num2);
		
		
//		int n1 = (10 - num1 > 0) ? 10-num1 : -(10-num1);
//		int n2 = 10 - num2;

//		//n1,n2�� ������ ��� -> ����� ��ȯ
//		if(n1 < 0) {
//			n1 = -n1;
//		}
//		if(n2 < 0) {
//			n2 = -n2;
//		}

		if (n1 > n2) {
			return num2;
		} else if (n1 < n2) {
			return num1;
		} else
			return 0;
	}
        // �巡�� ��
	    
	    
	    
	    
//	private static int close10(int num1, int num2) {
//		int a = 0;
//		int b = 10;
//		if(num1 > a && num1 > b) {
//		return num1;
//		}else if (num2 > a && num2 < b) {
//		return num2;
//		}else {
//		return 0;
//		}
//		
//	}
//     

	}


