package com.su.coupons.domain.enums;
//优惠券类型
public enum CouponType implements WithCode {
    //满减券
    FULL(0),
    //折扣券
    DISCOUNT(1),
    //赠品券
    GIFT(2),
    //代金券
    VOUCHER(3);
    private final int code;

    CouponType(int code) {
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
