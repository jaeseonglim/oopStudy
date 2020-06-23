package com.gthoya.app.offline.client;

import com.gthoya.app.offline.ticket.Ticket;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
