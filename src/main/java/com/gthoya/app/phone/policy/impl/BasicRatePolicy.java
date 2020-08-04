package com.gthoya.app.phone.policy.impl;

import com.gthoya.app.phone.call.Call;
import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.phone.Phone;
import com.gthoya.app.phone.policy.RatePolicy;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(Phone phone) {
        Money result = Money.ZERO;
        for (Call call : phone.getCalls()) {
            Money money = calculateCallFee(call);
            result = result.plus(money);
        }

        return result;
    }

    protected abstract Money calculateCallFee(Call call);
}
