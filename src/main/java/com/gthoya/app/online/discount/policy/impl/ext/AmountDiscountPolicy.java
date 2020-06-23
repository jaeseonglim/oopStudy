package com.gthoya.app.online.discount.policy.impl.ext;

import com.gthoya.app.online.discount.condition.DiscountCondition;
import com.gthoya.app.online.discount.policy.impl.DefaultDiscountPolicy;
import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.reservation.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}

