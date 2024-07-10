package com.javaex.ex12;

public class ColorPoint extends Point{

		//필드
	 	private String color;

	 	//생성자
		public ColorPoint() {
			super();
		}

		public ColorPoint(String color) {
			super();
			this.color = color;
		}
		
		public ColorPoint(int x, int y, String color) {
			//부모의 생성자 결정
			super.setX(x);	//부모쪽의 메소드 사용
			super.setY(y);	//부모쪽의 메소드 사용
			this.color = color;		//대입
			//super(); 부모의 기본생성자 사용
			//super(x,y); 부모의 다른 생성자 사용
		}

		//메소드 gs
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		//메소드 일반
		@Override
		public String toString() {
			return "ColorPoint [color=" + color + "]";
		}

		public void showInfo() {
			System.out.println("x: "+ super.getX());
			System.out.println("y: "+ super.getY());
			System.out.println("color: "+ color);
		}	
}
