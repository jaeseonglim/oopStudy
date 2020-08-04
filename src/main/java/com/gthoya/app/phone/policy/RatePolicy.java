package com.gthoya.app.phone.policy;

import com.gthoya.app.phone.money.Money;
import com.gthoya.app.phone.phone.Phone;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
