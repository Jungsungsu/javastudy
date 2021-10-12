package ex_03;

public class TempEmployee extends Employee {

	

	
	//持失切 五社球
	public TempEmployee(String empno, String name, int pay) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	
	
	
}
