package com.toncho.dao.map;

public class CartMap
{
    private Long id;

    private Long userId;

    private Long productId;

    private Float productPrice;

    private String productPicture;
    
    private String productName;

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

    public Float getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(Float productPrice)
    {
        this.productPrice = productPrice;
    }

    public String getProductPicture()
    {
        return productPicture;
    }

    public void setProductPicture(String productPicture)
    {
        this.productPicture = productPicture;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

}
