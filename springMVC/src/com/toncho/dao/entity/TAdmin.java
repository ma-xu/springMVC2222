package com.toncho.dao.entity;

import java.io.Serializable;

import com.toncho.util.pojo.StringAndEqualsPojo;

/**
 * @ClassName: TAdmin
* @Description: t_admin表对应的java bean类
 */
public class TAdmin extends StringAndEqualsPojo implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields t_admin.id :
     */
    private Long id;

    /**
     * @Fields t_admin.userName :
     */
    private String username;

    /**
     * @Fields t_admin.password :
     */
    private String password;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    
   
}