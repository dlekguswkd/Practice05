package com.javaex.ex11;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv( 7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);  //100으로 유지
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();

	}

}
