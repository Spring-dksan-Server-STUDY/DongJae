package com.dkanServer.dongjae.assignment1;

public class Yupddak extends Menu {
    private String rating;

    public Yupddak(String menu, String rating){
        super(menu);
        this.rating = rating;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    @Override
    public void hotLevel(String level){
        System.out.println(level + " 레벨의 맵기입니다 후!");
    }

}
