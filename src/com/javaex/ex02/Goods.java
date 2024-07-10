package com.javaex.ex02;

public class Goods {
	/*
	 다음은 GoodsApp 클래스에서 2곳의 오류가 발생했습니다. Goods 클래스 코드를 수정하여 오류가 발생하지 않도록
	수정하고 예상한 결과값과 비교해 보세요.( GoodsApp 클래스는 수정하지 말 것)
	[Goods.java --> *수정해볼것*]		[GoodsApp.java --> 수정하지말것]
	 */
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	//원래는 그냥 생기지만 다른 생성자가 생기면 사라지기 때문에 따로 또 써줘야함
	public Goods() {  //수정 -> 추가해줘야함
		
	}
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	
	//밑에 private --> public  으로 수정함  private는 우리가 손댈수없음
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	
	//정보출력
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}

	
	
}




