package com.su.coupons.domain.enums.distribute;

import com.su.coupons.domain.enums.WithCode;

//发放间隔
public enum DistributeInterval implements WithCode {
    //无限制
    UNLIMITED(0),
    //每天
    DAILY(1),
    //每周
    WEEKLY(2),
    //每月
    MONTHLY(3),
    //每年
    YEARLY(4),
    //每人
    PERSONAL(5);
    private final int code;

    DistributeInterval(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name();
    }
}
