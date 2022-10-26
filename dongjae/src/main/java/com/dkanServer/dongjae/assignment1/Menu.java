package com.dkanServer.dongjae.assignment1;

public class Menu implements MenuInterface {
    private String menu;

    public String getMenu(){
        return menu;
    }

    public void setMenu(String menu){
        this.menu = menu;
    }

    public Menu(String menu){
        this.menu = menu;
    }

    @Override
    public void serving() {
        System.out.println("주문하신 메뉴는 " + menu + " 입니다.");
    }

    @Override
    public void hotLevel(String level) {
        MenuInterface.super.hotLevel(level);
    }

    public void payforFood(){
        MenuInterface.payforFood();
    }
}
