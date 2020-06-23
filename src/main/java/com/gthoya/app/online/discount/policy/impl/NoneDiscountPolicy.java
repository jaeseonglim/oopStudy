package com.gthoya.app.online.discount.policy.impl;

import com.gthoya.app.online.discount.policy.DiscountPolicy;
import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.reservation.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
