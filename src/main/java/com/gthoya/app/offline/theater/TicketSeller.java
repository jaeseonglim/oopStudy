package com.gthoya.app.offline.theater;

import com.gthoya.app.offline.client.Audience;
import com.gthoya.app.offline.ticket.Ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public boolean sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        if (ticket == null) {
            return false;
        }

        long amount = audience.buy(ticketOffice.getTicket());
        if (amount < 0L) {
            return false;
        }

        return ticketOffice.sellTicketTo(amount);
    }
}
