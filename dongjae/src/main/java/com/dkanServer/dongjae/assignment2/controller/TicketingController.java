package com.dkanServer.dongjae.assignment2.controller;

import com.dkanServer.dongjae.assignment2.model.TicketInfo;
import lombook.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("ticketInfo")
@RequiredArgsConstructor
public class TicketingController {
    private final EntityManager em;

    @GetMapping("/{id}")
    public TicketInfo getTicket(@PathVariable(value = "id") final String id) {
        return em.find(TicketInfo.class, Long.parseLong(id));
    }

    @PostMapping("")
    @Transactional
    public Long takeTicket(@RequestBody final TicketInfo ticketInfo) {
        em.persist(ticketInfo);
        return ticketInfo.getId();
    }

//    @PatchMapping("/{id}")
//    @Transactional
//    public String changeSeat(@PathVariable String id,@PathVariable String seatNum) {
//
//        return seatNum;
//    }

    @DeleteMapping("/{id}")
    @Transactional
    public Long deleteTicket(Long id) {
        em.createQuery("delete from Ticket where id =: id")
                .setParameter("id", id)
                .executeUpdate();
        return id;
    }

}