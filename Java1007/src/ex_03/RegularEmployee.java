package ex_03;


public class RegularEmployee extends Employee{
	
	// Ŭ���� ���� : �Ӽ�(�ʵ�), �޼ҵ�(�ൿ)
	
	// ���, �̸�, ����, ���ʽ�
	
	int bonus;
	
	//������ �޼ҵ� (alt+shift+s)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
	    
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}


	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	//�����մϴ� ��

}
