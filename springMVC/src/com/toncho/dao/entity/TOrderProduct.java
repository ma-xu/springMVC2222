package com.toncho.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TOrder
 * @Description: t_cart表对应的java bean类
 */
public class TOrderProduct extends StringAndEqualsPojo implements Serializable
{
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    
    private Long orderId;
    
    private Long productId;

    public Long getOrderId()
    {
        return orderId;
    }

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
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
