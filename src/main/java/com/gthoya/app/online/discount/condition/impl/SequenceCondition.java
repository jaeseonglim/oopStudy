package com.gthoya.app.online.discount.condition.impl;

import com.gthoya.app.online.discount.condition.DiscountCondition;
import com.gthoya.app.online.reservation.Screening;

public class SequenceCondition implements DiscountCondition {
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
