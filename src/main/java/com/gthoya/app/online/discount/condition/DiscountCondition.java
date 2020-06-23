package com.gthoya.app.online.discount.condition;

import com.gthoya.app.online.reservation.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
