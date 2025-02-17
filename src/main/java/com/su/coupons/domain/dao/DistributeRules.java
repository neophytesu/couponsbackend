package com.su.coupons.domain.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName distribute_rules
 */
@TableName(value ="distribute_rules")
@Data
public class DistributeRules implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 发放渠道
     */
    private Integer channel;

    /**
     * 次数限制
     */
    private Integer counts;

    /**
     * 间隔限制
     */
    private Integer interval;

    /**
     * 发放方式
     */
    private Integer way;

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
        DistributeRules other = (DistributeRules) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getCounts() == null ? other.getCounts() == null : this.getCounts().equals(other.getCounts()))
            && (this.getInterval() == null ? other.getInterval() == null : this.getInterval().equals(other.getInterval()))
            && (this.getWay() == null ? other.getWay() == null : this.getWay().equals(other.getWay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getCounts() == null) ? 0 : getCounts().hashCode());
        result = prime * result + ((getInterval() == null) ? 0 : getInterval().hashCode());
        result = prime * result + ((getWay() == null) ? 0 : getWay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channel=").append(channel);
        sb.append(", counts=").append(counts);
        sb.append(", interval=").append(interval);
        sb.append(", way=").append(way);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}