package com.dkanServer.dongjae.assignment1;

public class Drink extends Menu{
    private String size;

    public Drink(String menu, String size){
        super(menu);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }
}
