package com.su.coupons.domain.enums.distribute;

import com.su.coupons.domain.enums.WithCode;

//发放方式
public enum DistributeWay implements WithCode {
    //不限
    UNLIMITED(0),
    //主动领取
    ACTIVE_RECEIVE(1),
    //自动发放
    AUTO_DISTRIBUTE(2);
    private final int code;

    DistributeWay(int code) {
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
