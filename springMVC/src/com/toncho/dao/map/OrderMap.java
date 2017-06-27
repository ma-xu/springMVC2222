package com.toncho.dao.map;

import com.toncho.dao.entity.TUser;

public class OrderMap
{
    private Long id;

    private TUser user;

    private String date;
    
    private String money;
    
    private String username;
    
    private String address;

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public TUser getUser()
    {
        return user;
    }

    public void setUser(TUser user)
    {
        this.user = user;
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
