package ex_03;

public abstract class Employee {

	//��� ���޵��� �������� ������ �ִ� ���� �����ϱ�
	 
	// �����ȣ, �̸�, ����(pay)
	String empno;
	String name;
	int pay;
	
	
	// ���� �޼ҵ�
	public abstract int getMoneyPay(); 
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
