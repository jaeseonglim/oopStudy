package com.gthoya.app.online.discount.policy;

import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.reservation.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}