package com.javaex.ex04;

public class Base {
	
	//다음과 같이 2가지 클래스가 제공된다.
	//BaseApp클래스를 실행했을 때 아래와 같이 나올 수 있도록 Base 클래스를 수정하세요.
	//(BaseApp 클래스는 수정하지 않습니다.)
    //if문 사용 (여쭤보고했음)
	//필드
	
	//생성자
	
	//메소드
    public void service(String state) {
        //코드작성할것
    	if(state.equals("낮")) {
    		day();
    	}else if (state.equals("밤")) {
    		night();
    	}else if (state.equals("오후")) {
    		afternoon();
    	}
    }

    
    //정보출력
    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        //코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

