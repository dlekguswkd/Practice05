package com.javaex.ex03;

public class Song {
	
	//아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	public Song() {
		System.out.println("Song(파라미터0개)");
	}
	
	//메소드
	public Song(String title, String artist, String album, String composer, String year) {
		this.title= title;
		this.artist= artist;
		this.album=album;
		this.composer=composer;
		this.year= year;
		System.out.println("Song(파라미터5개)");
	}
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track=track;
		System.out.println("Song(파라미터6개)");
	}
}



