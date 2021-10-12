package 상속2;

//휠마우스 클래스
//기능: 부모클래스의 기능 + 스크롤
public class WheelMouse extends Mouse{
    
	
	//Override(재정의) : 부모클래스의 내용 대신 자식클래스에서 새로운 내용으로 재정의하는 것
	//Override는 부모클래스에서 정의된 틀을 그대로 사용해야 함!
	//super키워드: 부모클래스를 지칭
	// -super(): 부모클래스의 생성자
	// - super.메소드명() : 부모클래스의 메소드
	@Override
	public void leftClick() {
		
		//super.leftClick(); //부모클래스의 leftClick() 호출! ->사용하지 않는다면 지워도 됨!
		System.out.println("휠마우스 왼쪽 클릭!");
	}
	
	//부모클래스의 rightClick()와 move()를 자식클래스에서 재정의하시오.
	
	@Override
	public void rightClick() {
		System.out.println("휠마우스 오른쪽 클릭!");
	}
	@Override
	public void move() {
		System.out.println("휠마우스 움직임!");
	}
	
	public void scroll() {
    	System.out.println("스크롤!");
    }
	
}
