package com.javaex.ex08;

public class Account {
	
	/*
	 아래와 같이 은행 프로그램을 작성하세요
	“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
	“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
	“3.잔고” 선택시 현재 잔고가 출력됩니다.
	“4.종료” 선택시 종료됩니다.
	“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
	 */

	//필드
    private String accountNo;
    private int balance;
	
	
    //생성자 작성
	public Account() {
	}
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	public Account(String accountNo, int balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}
    
    
    
    //필요한 메소드 작성
	public int deposit(int money) {		//예금
		balance = balance +money;
		return balance;
	}
	
	public int withdraw(int money) {	//출금
		balance = balance -money;
		return balance;
	}
	
	public void balance() {				//잔고
		System.out.println(balance);
	}

}
