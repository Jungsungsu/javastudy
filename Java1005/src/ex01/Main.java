package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// V : View ����ڿ��� �������� ���� ����� ������ �ִ�!
		
		Scanner sc = new Scanner(System.in);
		
		// MusicPlayer(MusicPlayer)�� ��ü ����
		// �ڵ������� ������ �޼ҵ尡 ȣ��ȴ�!
		MusicPlayer mp3 = new MusicPlayer();
		
		while(true) {
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� : ");
			int menu = sc.nextInt();
			
			if(menu == 5) {
				System.out.println("�÷��̾ �����մϴ�.");
				break;
			}else if(menu == 1) {
				Music m = mp3.play();
				
				mp3.print(m);
				
//				System.out.println(m.getSongName() + ", " + m.getSinger() + ", "
//				+ m.getPlayTime()/60 + "��" + m.getPlayTime()%60 + "��");
			}
			
			else if(menu == 2) {
				mp3.stop();
			}
			
			else if(menu == 3) {
				Music m = mp3.pre();
				mp3.print(m);
			}
			
			else if(menu == 4) {
				Music m = mp3.next();
				mp3.print(m);
			}
			
		}
		
		

	}

}
