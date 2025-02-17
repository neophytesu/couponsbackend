package com.su.coupons.domain.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName coupons
 */
@TableName(value ="coupons")
@Data
public class Coupons implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 券所属公司唯一标识+年月日+N位流水号
     */
    private String code;

    /**
     * 如满100减10新品券
     */
    private String name;

    /**
     * 库存
     */
    private String inventory;

    /**
     * 券的有效时间
     */
    private String activeTime;

    /**
     * 满减券 折扣券 代金券 赠品券
     */
    private String couponsType;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 发放规则
     */
    private Integer distributeRule;

    /**
     * 使用规则
     */
    private Integer useRule;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Coupons other = (Coupons) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getInventory() == null ? other.getInventory() == null : this.getInventory().equals(other.getInventory()))
            && (this.getActiveTime() == null ? other.getActiveTime() == null : this.getActiveTime().equals(other.getActiveTime()))
            && (this.getCouponsType() == null ? other.getCouponsType() == null : this.getCouponsType().equals(other.getCouponsType()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDistributeRule() == null ? other.getDistributeRule() == null : this.getDistributeRule().equals(other.getDistributeRule()))
            && (this.getUseRule() == null ? other.getUseRule() == null : this.getUseRule().equals(other.getUseRule()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getInventory() == null) ? 0 : getInventory().hashCode());
        result = prime * result + ((getActiveTime() == null) ? 0 : getActiveTime().hashCode());
        result = prime * result + ((getCouponsType() == null) ? 0 : getCouponsType().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDistributeRule() == null) ? 0 : getDistributeRule().hashCode());
        result = prime * result + ((getUseRule() == null) ? 0 : getUseRule().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", inventory=").append(inventory);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", couponsType=").append(couponsType);
        sb.append(", state=").append(state);
        sb.append(", distributeRule=").append(distributeRule);
        sb.append(", useRule=").append(useRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}