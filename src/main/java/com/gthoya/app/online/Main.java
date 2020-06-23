package com.gthoya.app.online;

import com.gthoya.app.online.client.Customer;
import com.gthoya.app.online.discount.condition.impl.PeriodCondition;
import com.gthoya.app.online.discount.condition.impl.SequenceCondition;
import com.gthoya.app.online.discount.policy.impl.ext.AmountDiscountPolicy;
import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.reservation.Reservation;
import com.gthoya.app.online.reservation.Screening;
import com.gthoya.app.online.theater.Movie;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        Movie avatar = new Movie("avatar",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59))));

        Screening screening = new Screening(avatar, 1, LocalDateTime.of(LocalDate.now(), LocalTime.of(10, 30)));

        Reservation reservation = new Reservation(new Customer(), screening, avatar.getFee(), 2);
    }
}
