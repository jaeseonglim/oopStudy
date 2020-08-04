package com.gthoya.app.phone.policy.ext;

import com.gthoya.app.phone.call.Call;
import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.policy.impl.BasicRatePolicy;

import java.time.Duration;

public class RegularPolicy extends BasicRatePolicy {
    private Money amount;
    private Duration seconds;

    public RegularPolicy(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
