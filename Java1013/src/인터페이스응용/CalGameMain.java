package �������̽�����;

import java.util.Scanner;

//Game UI(View) & Play(Controller)
//����Ƚ�� üũ
//�����ȸ Ƚ�� üũ
//����ڷκ��� �� �Է�
//�޽��� ���
public class CalGameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// GameDummy dummy = new GameDummy();
		PlusGame plusGame = new PlusGame();
		for (int n = 0; n < 5; n++) {
			// 1.������ ����
			plusGame.makeRandom(); // 1

			for (int i = 0; i < 3; i++) {
				// 2.�������ڸ� �̿��Ͽ� ��������
				String quiz = plusGame.getQuizMsg();
				System.out.print(quiz); // 2
				int answer = sc.nextInt();

				// 3.����üũ
				if (plusGame.checkAnswer(answer)) { // 3 int answer���� �Ѿ��
					System.out.println("�� ������!");
					break;
				} else {
					if (i == 0) {
						System.out.println("�ٽ� ������ �����?");
					} else if (i == 1) {
						System.out.println("�� ����..!");
					} else {
						System.out.println("�׳� ���� ������ �Ѿ����..");
					}
				}
			} // end for
		} // end for
	}// end main

}// end class
