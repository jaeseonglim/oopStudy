package com.gthoya.app.theater.online.discount.condition;

import com.gthoya.app.theater.online.reservation.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
