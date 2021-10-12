package ex01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// V : View 사용자에게 보여지기 위한 기능을 가지고 있다!
		
		Scanner sc = new Scanner(System.in);
		
		// MusicPlayer(MusicPlayer)의 객체 생성
		// 자동적으로 생성자 메소드가 호출된다!
		MusicPlayer mp3 = new MusicPlayer();
		
		while(true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 : ");
			int menu = sc.nextInt();
			
			if(menu == 5) {
				System.out.println("플레이어를 종료합니다.");
				break;
			}else if(menu == 1) {
				Music m = mp3.play();
				
				mp3.print(m);
				
//				System.out.println(m.getSongName() + ", " + m.getSinger() + ", "
//				+ m.getPlayTime()/60 + "분" + m.getPlayTime()%60 + "초");
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
