package com.gthoya.app.theater.offline.theater;

import com.gthoya.app.theater.offline.ticket.Ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public long getAmount() {
        return amount;
    }

    public Ticket getTicket() {
        if (tickets.isEmpty()) {
            return null;
        }

        return tickets.get(0);
    }

    public TicketOffice(long amount, Ticket ... tickets) {
        this.amount = amount;

        if (tickets == null) {
            return;
        }

        this.tickets.addAll(Arrays.asList(tickets));
    }

    public boolean sellTicketTo(long amount) {
        plusAmount(amount);
        removeTicket();
        return true;
    }

    private Ticket removeTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(long amount) {
        this.amount += amount;
    }
}
