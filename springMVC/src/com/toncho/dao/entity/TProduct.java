package com.toncho.dao.entity;

import java.io.Serializable;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TProduct
 * @Description: t_product表对应的java bean类
 */
public class TProduct extends StringAndEqualsPojo implements Serializable
{
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields t_product.id :
     */
    private Long id;

    /**
     * @Fields t_product.name :
     */
    private String name;

    /**
     * @Fields t_product.type :
     */
    private String type;

    /**
     * @Fields t_product.price :
     */
    private Float price;

    /**
     * @Fields t_product.picture :
     */
    private String picture;

    /**
     * @Fields t_product.number :
     */
    private Integer number;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Float getPrice()
    {
        return price;
    }

    public void setPrice(Float price)
    {
        this.price = price;
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

}
