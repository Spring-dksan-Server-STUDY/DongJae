package com.dkanServer.dongjae;


import com.dkanServer.dongjae.assignment1.Drink;
import com.dkanServer.dongjae.assignment1.Menu;
import com.dkanServer.dongjae.assignment1.Yupddak;
import com.dkanServer.dongjae.week1.Generic;
import com.dkanServer.dongjae.week1.Server;
import com.dkanServer.dongjae.week1.User;
import com.dkanServer.dongjae.week1.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.MapKeyEnumerated;

@SpringBootApplication
public class DongjaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DongjaeApplication.class, args);

		//클래스 실습
//		User user = new User(1, "김동재", "Server");
//		user.introduce();
//
//		user.setName("소현");
//		user.setPart("안드");
//
//		String name = user.getName();
//		System.out.println(name);
//		user.introduce();
//
//		//인터페이스 실습
//		UserServiceImpl userService = new UserServiceImpl();
//		String club = userService.CLUB;
//		System.out.println(club);
//		userService.getInfo(30, "서버");
//		userService.getSOPT();
//
//		//상속 실습
//		Server server = new Server("김동재", "spring");
//		String name2 = server.getName();
//		String language = server.getStudy();
//		System.out.println(name2);
//		System.out.println(language);
//
//		server.test();
//
//		//제네릭 실습
//		Generic<String> generic1 = new Generic<>("dongjae");
//		Generic<Integer> generic2 = new Generic<>(23);
//		generic1.printData();
//		generic2.printData();

		//assignment1
		Menu menu = new Menu("치즈엽떡");
		System.out.println(menu + " 으로 주문할게요!");
		menu.serving();
		menu.hotLevel("3단계");
		menu.payforFood();

		Yupddak yupddak = new Yupddak("마라엽떡", "별 5개");
		System.out.println("온라인 평점 " +yupddak.getRating()+ "메뉴명 "+yupddak.getMenu());
		yupddak.serving();
		yupddak.hotLevel("1단계");
		yupddak.payforFood();

		Drink drink = new Drink("쿨피스", "0.5L");
		System.out.println("메뉴명 "+drink.getMenu() + "음료 사이즈 " +drink.getSize());
		drink.serving();
		drink.payforFood();
	}

}
