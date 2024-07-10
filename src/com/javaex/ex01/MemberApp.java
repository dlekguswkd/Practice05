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

		
	}

}
