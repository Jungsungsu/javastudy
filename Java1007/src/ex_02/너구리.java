package ex_02;

public class 너구리 extends 라면 {
	// 추상 클래스를 상속 받아 온다면
	// 추상 클래스 안에 있는 추상 메소드에 대해
	// 무조건! 강제적으로! 구체적인 구현이 필요하다! 
	
//   public void 면() {
//	   
//   }
	
	@Override
	public void 면() {
		System.out.println("쫄깃 쫄깃 오동통통 농심 너구리면!");
	}

	@Override
	public void 부가재료() {
		System.out.println("귀여운 너구리 오뎅");
		
	}
}
