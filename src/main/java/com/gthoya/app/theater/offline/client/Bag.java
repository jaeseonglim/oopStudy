package com.gthoya.app.theater.offline.client;

import com.gthoya.app.theater.offline.ticket.Invitation;
import com.gthoya.app.theater.offline.ticket.Ticket;

public class Bag {
    private long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);

            return 0L;
        } else {
            if (amount < ticket.getFee()) {
                return -1L;
            }

            minusAmount(ticket.getFee());
            setTicket(ticket);

            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(long amount) {
        this.amount -= amount;
    }
}
