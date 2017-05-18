package com.toncho.dao.entity;

import java.io.Serializable;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TOrder
 * @Description: t_cart表对应的java bean类
 */
public class TCart extends StringAndEqualsPojo implements Serializable
{
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    
    private Long id;

    private Long userId;

    private Long productId;

    

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

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    

}
