package com.dkanServer.dongjae.week2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Members {
    private String name;
    private int age;

    @Id
    @GeneratedValue
    private Long id;

    public Members() {

    }

    public Members(final String name, final int age, final Long id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}