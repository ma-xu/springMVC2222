package com.toncho.dao.entity;

import java.io.Serializable;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TOrder
 * @Description: t_cart表对应的java bean类
 */
public class TOrder extends StringAndEqualsPojo implements Serializable
{
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    
    private Long id;

    private Long userId;

    private String date;
    
    private String money;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getMoney()
    {
        return money;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }
    
   
    
    

}
