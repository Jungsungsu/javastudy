
public class ex_method_3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = LargerNumbers(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);

	}
       //�巡�� ������
	    public static int LargerNumbers(int num1,int num2) {
    	
    	if(num1 > num2) { //num1�� ū ���
    		return num1;
    	}else if (num1 < num2) { //num2�� ū ���
    		return num2;
    	}else { // �� ���� ������ ���
    		return 0;
    	}
    	
    }
         // �巡�� ��
}
