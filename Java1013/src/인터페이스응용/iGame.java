package 인터페이스응용;

public interface iGame {
    //3가지 기능 정의 : 랜덤숫자생성, 문제출제, 정답체크
	
	public void makeRandom();
	
	public String getQuizMsg();
	
	public boolean checkAnswer(int answer);
	
}
