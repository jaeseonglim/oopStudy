package com.gthoya.app.theater.offline;

import com.gthoya.app.theater.offline.client.Audience;
import com.gthoya.app.theater.offline.client.Bag;
import com.gthoya.app.theater.offline.theater.Theater;
import com.gthoya.app.theater.offline.theater.TicketOffice;
import com.gthoya.app.theater.offline.theater.TicketSeller;
import com.gthoya.app.theater.offline.ticket.Invitation;
import com.gthoya.app.theater.offline.ticket.Ticket;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(50L);
        Ticket ticket2 = new Ticket(50L);

        TicketOffice ticketOffice = new TicketOffice(100L, ticket1, ticket2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Audience audience1 = new Audience(new Bag(10L));
        Audience audience2 = new Audience(new Bag(new Invitation(), 10L));
        Audience audience3 = new Audience(new Bag(100L));
        Audience audience4 = new Audience(new Bag(100L));

        System.out.println(theater.enter(audience1) + " " + ticketOffice.getAmount());
        System.out.println(theater.enter(audience2) + " " + ticketOffice.getAmount());
        System.out.println(theater.enter(audience3) + " " + ticketOffice.getAmount());
        System.out.println(theater.enter(audience4) + " " + ticketOffice.getAmount());
    }
}
