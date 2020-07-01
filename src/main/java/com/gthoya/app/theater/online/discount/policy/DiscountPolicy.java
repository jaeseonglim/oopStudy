package com.gthoya.app.theater.online.discount.policy;

import com.gthoya.app.theater.online.money.Money;
import com.gthoya.app.theater.online.reservation.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}