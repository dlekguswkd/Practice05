package com.javaex.ex11;

public class Tv {
	
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드 gs
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	//메소드 일반
	public void power(boolean on) {
		 if (power==true) {
			 System.out.println("티비가 켜졌습니다.");
			 this.power=true;
		 }else if(power==false) {
			 System.out.println("티비가 꺼졌습니다.");
			 this.power=false;
		 }
	}
	
	public void channel(int channel) {
		if (0<channel && channel<=255) {
			this.channel=channel;
		}else {
			System.out.println("채널 오류");
		}
	}
	
	public void channel(boolean up) {
		if (0<channel && channel<=255) {
			if (up==true) {
				channel++;
			}else if(up==false) {
				channel--;
			}
		}else if (channel<0 || channel>255) {
			channel=channel;
			System.out.println("범위 밖");
		}
		
		
	}
	
	public void volume(int voluem) {
		if (0<=volume && volume<=100) {
			this.volume=volume;
		}else if(volume>100){
			this.volume=100;
		}
	}
	
	public void volume(boolean up) {
		if (0<=volume && volume<=100) {
			if (up==true) {
				volume++;
			}else if(up==false) {
				volume--;
			}
		}else if (volume<0 || volume>100) {
			volume=volume;
			System.out.println("범위 밖");
		}
		
		
	}
	
	public void status() {
		System.out.println("파워: "+ power +"  채널: "+ channel+"  볼륨:"+volume);
	}

}


