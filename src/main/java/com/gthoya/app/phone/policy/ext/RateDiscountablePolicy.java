package com.gthoya.app.phone.policy.ext;

import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.policy.RatePolicy;
import com.gthoya.app.phone.policy.impl.AdditionalRatePolicy;

public class RateDiscountablePolicy extends AdditionalRatePolicy {
    private Money discountAmount;

    public RateDiscountablePolicy(Money discountAmount, RatePolicy next) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
