package com.dkanServer.dongjae.assignment2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TicketInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name; //예약자명
    private String airLine; //항공사
    private String flightTo; //행선지
    private String seatNum; //좌석번호

    public Tickets(Long id, String name, String airLine, String flightTo, String seatNum){
        this.id = id;
        this.name = name;
        this.airLine=airLine;
        this.flightTo=flightTo;
        this.seatNum=seatNum;
    }
}