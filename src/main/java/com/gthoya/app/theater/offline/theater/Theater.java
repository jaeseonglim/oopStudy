package com.gthoya.app.theater.offline.theater;

import com.gthoya.app.theater.offline.client.Audience;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public boolean enter(Audience audience) {
        return ticketSeller.sellTo(audience);
    }
}
