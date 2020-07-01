package com.gthoya.app.theater.offline.ticket;

public class Ticket {
    private long fee;

    public Ticket(long fee) {
        this.fee = fee;
    }

    public long getFee() {
        return fee;
    }
}
