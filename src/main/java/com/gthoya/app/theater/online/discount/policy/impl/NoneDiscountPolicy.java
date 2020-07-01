package com.gthoya.app.theater.online.discount.policy.impl;

import com.gthoya.app.theater.online.discount.policy.DiscountPolicy;
import com.gthoya.app.theater.online.money.Money;
import com.gthoya.app.theater.online.reservation.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
