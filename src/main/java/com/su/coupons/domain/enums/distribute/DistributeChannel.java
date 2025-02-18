package com.su.coupons.domain.enums.distribute;

import com.su.coupons.domain.enums.WithCode;

//发放渠道
public enum DistributeChannel implements WithCode {
    //不限
    UNLIMITED(0),
    //线上
    ONLINE(1),
    //线下
    OFFLINE(2);
    private final int code;

    DistributeChannel(int code) {
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
