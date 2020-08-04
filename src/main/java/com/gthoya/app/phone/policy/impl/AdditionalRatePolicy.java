package com.gthoya.app.phone.policy.impl;

import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.phone.Phone;
import com.gthoya.app.phone.policy.RatePolicy;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(Phone phone) {
        Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }

    abstract protected Money afterCalculated(Money fee);
}
