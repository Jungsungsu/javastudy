package ex_03;


public class PartTimeEmployee extends Employee {

	
	int workDay;
	
	//������ �޼ҵ�
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay*workDay;
	}
	
	
	
}