package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.entity.TAddress;


/**
 * @ClassName: TAddressrMapper
 * @Description: t_address表对应的dao操作Mapper映射类
 */
public interface TAddressMapper {

    int save(TAddress address);
    
    int delete(Long id);
    
    List<TAddress> findMapbyUserId(Long userId);

}