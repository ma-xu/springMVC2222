package com.toncho.dao.entity;

import java.io.Serializable;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TCoupon
 * @Description: t_coupon表对应的java bean类
 */
public class TCoupon extends StringAndEqualsPojo implements Serializable
{
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields t_coupon.couponID :
     */
    private Long couponID;

    /**
     * @Fields t_coupon.amount :
     */
    private Integer amount;

    /**
     * @Fields t_coupon.type :
     */
    private String type;

    public Long getCouponID()
    {
        return couponID;
    }

    public void setCouponID(Long couponID)
    {
        this.couponID = couponID;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

}
