package ex_03;


public class RegularEmployee extends Employee{
	
	// 클래스 구조 : 속성(필드), 메소드(행동)
	
	// 사번, 이름, 연봉, 보너스
	
	int bonus;
	
	//생성자 메소드 (alt+shift+s)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
	    
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}


	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
	//감사합니다 ㅜ

}
