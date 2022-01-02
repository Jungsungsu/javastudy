package 인터페이스응용;

public class GameDummy implements iGame {

	@Override
	public void makeRandom() {

	}

	@Override
	public String getQuizMsg() {
		return "4+5 =";
	}

	@Override
	public boolean checkAnswer(int answer) { // 3 (4+5)==3? true:false
		return false;
	}

}
