package com.dkanServer.dongjae.assignment1;

public interface MenuInterface {
    //상수 메소드
    String restaurant = "안무서버 맛집";

    //추상 메소드
    void serving();

    //default 메소드
    default void hotLevel(String level){
        System.out.println(level + "입니다.");
    }

    //static 메소드
    static void payforFood(){
        System.out.println("계산할게요~");
    }

}
