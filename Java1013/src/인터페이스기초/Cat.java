package ÀÎÅÍÆäÀÌ½º±âÃÊ;

public class Cat extends Animal implements iShakeable{

	@Override
	public void crying() {
		System.out.println("²¿¸®¸¦ »ì¶û»ì¶û");
		
	}

	@Override
	public void shaking() {
		System.out.println("¾ß¿Ë~!");
		
	}

}
