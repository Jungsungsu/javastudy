package ex_03;

public abstract class Employee {

	//모든 직급들이 공통으로 가질수 있는 내용 정리하기
	 
	// 사원번호, 이름, 연봉(pay)
	String empno;
	String name;
	int pay;
	
	
	// 공통 메소드
	public abstract int getMoneyPay(); 
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}
