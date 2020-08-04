package com.gthoya.app.phone.policy.ext;

import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.policy.RatePolicy;
import com.gthoya.app.phone.policy.impl.AdditionalRatePolicy;

public class TaxablePolicy extends AdditionalRatePolicy {
    private double taxRatio;

    public TaxablePolicy(double taxRatio, RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
