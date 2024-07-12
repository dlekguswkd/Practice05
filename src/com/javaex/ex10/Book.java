package com.javaex.ex10;

public class Book {
	
	//주어진 BookShop.java 를 실행했을 때 다음과 같은 실행결과가 나타나도록 아래의 문제설명을 참고하여
	//Book.java 를 작성하고 BookShop.java 를 완성하세요.
	//도움받음 다시풀어보기
    
		private int bookNo;
		private String title;
		private String author;
		private int stateCode;
		
		//생성자
		public Book() {
			super();
		}
		
		public Book(int bookNo, String title, String author) {
			super();
			this.bookNo = bookNo;
			this.title = title;
			this.author = author;
			this.stateCode = 1;		//단,stateCode는 생성자 호출 시에 1로 세팅 되도록 설정합니다.
		}

		public int getBookNo() {
			return bookNo;
		}

		public void setBookNo(int bookNo) {
			this.bookNo = bookNo;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		} 
		
		//메소드 일반
		public void rent() {
			stateCode = 0;
			System.out.println(title + "이(가) 대여 됐습니다.");
		}
		
		public void print() {
			String rentState;
			if(stateCode == 1 ) {
	    		rentState = "재고있음";
	    	}else {
	    		rentState = "대여중";
	    	}
	        System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + rentState);
		}
    
    
    
}
