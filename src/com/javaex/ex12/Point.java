package com.javaex.ex12;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		super();
	}

	//생성자 오버로딩
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 일반
	@Override
	public String toString() { //개발용
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void showInfo() {
		System.out.println("점[x= "+ x + "]");
		System.out.println("점[y= "+ y + "]");
	}
}
