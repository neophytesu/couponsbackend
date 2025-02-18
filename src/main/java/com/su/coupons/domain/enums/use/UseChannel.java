package com.su.coupons.domain.enums.use;

import com.su.coupons.domain.enums.WithCode;

//使用渠道
public enum UseChannel implements WithCode {
    //不限
    ALL(0),
    //线上
    ONLINE(1),
    //线下
    OFFLINE(2);
    private final int code;

    UseChannel(int code) {
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
