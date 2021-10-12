package ex01;

import java.util.ArrayList;
    
public class MusicPlayer {
	
    // C : Controller ����ڰ� ����� ���� �ֵ��� ������ �ִ� ����!
	// ���ʷ� �뷡�� ��� musiclist ����� -> ArrayList ���!
	ArrayList<Music> musiclist = new ArrayList<>();
	
	//������ �÷��� ������ �������� �� �ִ� ���� ����!
	int index = 0;
	
	// �뷡�� �߰��� �� �ִ� MusicPlayer ������ �޼ҵ�
	public MusicPlayer() {
		musiclist.add(new Music("��ȣ��","�̹���", 100));
		musiclist.add(new Music("��������","�̹���", 230));
		musiclist.add(new Music("�״��","����", 310));
		musiclist.add(new Music("�Ѹ�","�극�̺�ɽ�", 210));
	}
	
	// ��� �޼ҵ�
	public Music play() {
		// musiclist�� ����ִ� 1��° �� �����ϱ�!
	    return musiclist.get(index);
	}
    // ���� �޼ҵ�
	public void stop() {
		System.out.println("���� ����� ���� �Ǿ����ϴ�.");
		
	}
    // ������ ��� �޼ҵ�
	public Music pre() {
		// 3 2 1 0 -> 3 2 1 0 ->3
	   if(index > 0) {
		   index--;
	   }else {
		   index = musiclist.size()-1;
	   }
	   
	   return musiclist.get(index);
		
	}
    // ������ ��� �޼ҵ�
	public Music next() {
		// 0 1 2 3 -> 0 1 2 3 -> 0
		if(index < musiclist.size()-1) {
			index++;
		}else {
			index = 0;
		}
		
		return musiclist.get(index);
		
	}
	
	//�뷡 ������ ����Ҽ� �ִ� �޼ҵ�
	public void print(Music m) {
		System.out.println(m.getSongName() + ", " + m.getSinger() + ", "
				+m.getPlayTime());
	}
	
	
}
