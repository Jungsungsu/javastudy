package ex01;

public class Music {

	// M : model
	
	
	private String songName;
	private String singer;
	private int playTime;
	
	public Music() {};
	
	// 持失切 五社球
	public Music(String songName, String singer, int playTime) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	
	
	
}
