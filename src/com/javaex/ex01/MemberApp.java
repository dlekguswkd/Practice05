package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member[] memberArray= new Member[3];
		
		Member jung= new Member("jws", "정우성", 50000);
		Member yoo= new Member("yjs", "유재석", 30000);
		Member lee= new Member("lhr", "이효리", 40000);
		
		memberArray[0]=jung;
		memberArray[1]=yoo;
		memberArray[2]=lee;
		
		for (int i=0; i<memberArray.length; i++) {
			memberArray[i].showInfo();
		}

		
		/*
		 Member m1 = new Member();
	   Member m2 = new Member();
	   Member m3 = new Member();
	   
	   m1.setId("jws");
	   m1.setName("정우성");
	   m1.setPoint(50000);
	   
	   m2.setId("yjs");
	   m2.setName("유재석");
	   m2.setPoint(30000);
	   
	   m3.setId("lhr");
	   m3.setName("이효리");
	   m3.setPoint(40000);
	   
	   m1.showInfo();
	   m2.showInfo();
	   m3.showInfo();
		 */
		
	}

}
