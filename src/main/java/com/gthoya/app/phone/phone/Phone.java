package com.gthoya.app.phone.phone;

import com.gthoya.app.phone.call.Call;
import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.policy.RatePolicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public void setCalls(List<Call> calls) {
        this.calls = Collections.unmodifiableList(calls);
    }

    public List<Call> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }
}
