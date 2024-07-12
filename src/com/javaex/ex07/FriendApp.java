package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        //아파트 만들어주기 (도움받았음)
        Friend f1 =new Friend();
        Friend f2 =new Friend();
        Friend f3 =new Friend();
        //집주민 입주시켜주기   (도움받았음) 
        friendArray[0]=f1;  //첫번째로 입력하는 세가지(한사람의 정보3가지)
        friendArray[1]=f2;	//두번째로 입력하는 세가지(한사람의 정보3가지)
        friendArray[2]=f3;	//세번째로 입력하는 세가지(한사람의 정보3가지)

        System.out.println("친구를 3명 등록해 주세요");

        
        //for문 시작
        for (int i=0; i<friendArray.length; i++) {
        	 //친구정보 3명 입력 로직 --> 반복문 사용
        	 System.out.print("이름:");
        	 String name=sc.nextLine();
        	 System.out.print("핸드폰:");
        	 String hp=sc.nextLine();
        	 System.out.print("학교:");
        	 String School=sc.nextLine();
        	 System.out.println("-------------");
        	 friendArray[i].setName(name); //도움받았음
        	 friendArray[i].setHp(hp);
        	 friendArray[i].setSchool(School);
        }
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
        

        /*이게 한사람 이걸 포문돌려서 3번할수도 있음
         Friend[] friendArray = new Friend[3];
         Scanner sc = new Scanner(System.in);
        
         * for (int i=0; i<friendArray.length: i++) {
          
         
         		Friend friend = new Frind();  //밀가루
         
        		//속넣기 // 정보넣기
         		String name = sc.nextLine();
         		String hp = sc.nextLine();
         		String school = sc.nextLine();
         
         		friend.setName(name);
         		friend.setHp(hp);
         		friend.setSchool(School);
        
         		//박스에 넣기 //입주
         		friendArray[i]=frind; 
         
         */
        
        
        /* 강사님의 답
          Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        for (int i = 0; i < friendArray.length; i++) {
            // 친구정보(이름)
        	System.out.print("이름: ");
            String name = sc.nextLine();
            
            // 친구정보(핸드폰)
            System.out.print("핸드폰: ");
            String hp = sc.nextLine();
            
            // 친구정보(학교)
            System.out.print("학교: ");
            String school = sc.nextLine();
            
            System.out.println("-------------------------------------");

            // Friend 객체 생성하여 데이터 넣기
            Friend friend = new Friend();
            friend.setName(name);
            friend.setHp(hp);
            friend.setSchool(school);

            // 배열에 추가하기
            friendArray[i] = friend;
        }

        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
         */
    }

}
