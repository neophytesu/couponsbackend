package com.su.coupons.domain.enums.use;

import com.su.coupons.domain.enums.WithCode;

//产品范围
public enum UseScope implements WithCode {
    //全部产品
    ALL(0),
    //类别限定
    CATEGORY(1),
    //单品限定
    SINGLE(2);

    private final int code;

    UseScope(int code) {
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
