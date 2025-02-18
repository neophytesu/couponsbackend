package com.su.coupons.domain.enums.use;

import com.su.coupons.domain.enums.WithCode;

public enum UseStore implements WithCode {
    //全部门店
    ALL(0),
    //指定门店
    SPECIFIC(1);
    private final int code;

    UseStore(int code) {
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
