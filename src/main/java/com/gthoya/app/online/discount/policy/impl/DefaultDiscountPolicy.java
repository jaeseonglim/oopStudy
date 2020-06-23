package com.gthoya.app.online.discount.policy.impl;

import com.gthoya.app.online.discount.condition.DiscountCondition;
import com.gthoya.app.online.discount.policy.DiscountPolicy;
import com.gthoya.app.online.money.Money;
import com.gthoya.app.online.reservation.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        if (conditions == null) {
            return;
        }

        this.conditions.addAll(Arrays.asList(conditions));
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}