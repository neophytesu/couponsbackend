package com.su.coupons.domain.enums;

//优惠券状态
public enum CouponState implements WithCode {
    //待提交
    UNSUBMITTED(0),
    //待审核
    UNREVIEWED(1),
    //待开始
    UNSTARTED(2),
    //活动中
    ACTIVE(3),
    //已结束
    EXPIRED(4),
    //已驳回
    REJECTED(5),
    //已停用
    DELIVERED(6);
    private final int code;

    CouponState(int code) {
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
