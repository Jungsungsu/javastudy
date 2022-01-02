package 인터페이스응용;

import java.util.Scanner;

//Game UI(View) & Play(Controller)
//게임횟수 체크
//정답기회 횟수 체크
//사용자로부터 값 입력
//메시지 출력
public class CalGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// GameDummy dummy = new GameDummy();
		PlusGame plusGame = new PlusGame();
		for (int n = 0; n < 5; n++) {
			// 1.랜덤수 생성
			plusGame.makeRandom(); // 1

			for (int i = 0; i < 3; i++) {
				// 2.랜덤숫자를 이용하여 문제생성
				String quiz = plusGame.getQuizMsg();
				System.out.print(quiz); // 2
				int answer = sc.nextInt();

				// 3.정답체크
				if (plusGame.checkAnswer(answer)) { // 3 int answer에서 넘어옴
					System.out.println("잘 맞췄어요!");
					break;
				} else {
					if (i == 0) {
						System.out.println("다시 생각해 볼까요?");
					} else if (i == 1) {
						System.out.println("한 번더..!");
					} else {
						System.out.println("그냥 다음 문제로 넘어갈께요..");
					}
				}
			} // end for
		} // end for
	}// end main

}// end class
