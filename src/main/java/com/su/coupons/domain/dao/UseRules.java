package com.su.coupons.domain.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName use_rules
 */
@TableName(value ="use_rules")
@Data
public class UseRules implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 适用范围
     */
    private Integer scope;

    /**
     * 适用门店
     */
    private Integer store;

    /**
     * 消费门槛
     */
    private Integer doorsill;

    /**
     * 同一组的券可以叠加使用
     */
    private Integer group;

    /**
     * 使用时间
     */
    private Date date;

    /**
     * 生效时间
     */
    private Date active;

    /**
     * 生效渠道
     */
    private Integer channel;

    /**
     * 
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
        UseRules other = (UseRules) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getDoorsill() == null ? other.getDoorsill() == null : this.getDoorsill().equals(other.getDoorsill()))
            && (this.getGroup() == null ? other.getGroup() == null : this.getGroup().equals(other.getGroup()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getUseRule() == null ? other.getUseRule() == null : this.getUseRule().equals(other.getUseRule()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getDoorsill() == null) ? 0 : getDoorsill().hashCode());
        result = prime * result + ((getGroup() == null) ? 0 : getGroup().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
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
        sb.append(", scope=").append(scope);
        sb.append(", store=").append(store);
        sb.append(", doorsill=").append(doorsill);
        sb.append(", group=").append(group);
        sb.append(", date=").append(date);
        sb.append(", active=").append(active);
        sb.append(", channel=").append(channel);
        sb.append(", useRule=").append(useRule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}