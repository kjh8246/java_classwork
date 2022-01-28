package koreait.day17;

public class SmartMachine implements RemoteControl, WebSearch {
	
	private int volume;	//초기값 0
	private String url;	//초기값null
	private boolean power;	//false
	
	//WebSearch 인터페이스
	@Override
	public void search(String url) {
		System.out.println("브로드밴드 서비스로 인터넷에 연결합니다.");
		System.out.println(url+" 에 접속합니다.");
		this.url=url;
	}

	@Override
	public void play(boolean play) {
		if(play) {
			System.out.println("동영상 재생을 시작합니다.");
		}else {
			System.out.println("동영상 재생을 중지합니다.");
		}
	}
	
	//RemoteControl 인터페이스 추상메소드
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume < RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 스마트TV 객체 볼륨은 "+this.volume);
	}

	@Override
	public void turnOnOff() {	//toggle 기능으로 메소드 구현했다.
		if(this.power) {
//			this.power=false;
			System.out.println("전원을 끕니다.");
		}
		else {
//			this.power=true;
			System.out.println("전원을 켭니다.");
		}
		this.power = !this.power;
	}
	
	//getter
	public String getUrl() {
		return url;
	}
	
	public int getVolume() {
		return volume;
	}
	
	
	@Override
	public void setMute(boolean mute) {
		System.out.println("mute 기능 없습니다");
	}
	
	@Override
	public void setBettery() {
		System.out.println("영구적인 배터리 사용합니다.");
	}
	
	

}











