package ex01;

import java.util.ArrayList;
    
public class MusicPlayer {
	
    // C : Controller 사용자가 기능을 쓸수 있도록 연결해 주는 역할!
	// 최초로 노래가 담길 musiclist 만들기 -> ArrayList 사용!
	ArrayList<Music> musiclist = new ArrayList<>();
	
	//음악의 플레이 순서를 변경해줄 수 있는 변수 생성!
	int index = 0;
	
	// 노래를 추가할 수 있는 MusicPlayer 생성자 메소드
	public MusicPlayer() {
		musiclist.add(new Music("신호등","이무진", 100));
		musiclist.add(new Music("붉은노을","이문세", 230));
		musiclist.add(new Music("그대로","오왠", 310));
		musiclist.add(new Music("롤린","브레이브걸스", 210));
	}
	
	// 재생 메소드
	public Music play() {
		// musiclist에 들어있는 1번째 곡 실행하기!
	    return musiclist.get(index);
	}
    // 정지 메소드
	public void stop() {
		System.out.println("음악 재생이 중지 되었습니다.");
		
	}
    // 이전곡 재생 메소드
	public Music pre() {
		// 3 2 1 0 -> 3 2 1 0 ->3
	   if(index > 0) {
		   index--;
	   }else {
		   index = musiclist.size()-1;
	   }
	   
	   return musiclist.get(index);
		
	}
    // 다음곡 재생 메소드
	public Music next() {
		// 0 1 2 3 -> 0 1 2 3 -> 0
		if(index < musiclist.size()-1) {
			index++;
		}else {
			index = 0;
		}
		
		return musiclist.get(index);
		
	}
	
	//노래 정보를 출력할수 있는 메소드
	public void print(Music m) {
		System.out.println(m.getSongName() + ", " + m.getSinger() + ", "
				+m.getPlayTime());
	}
	
	
}
