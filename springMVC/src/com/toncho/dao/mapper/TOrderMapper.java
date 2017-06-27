package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.entity.TOrder;



/**
 * @ClassName: TOrderMapper
 * @Description: t_user表对应的dao操作Mapper映射类
 */
public interface TOrderMapper {
    int save(TOrder order);
    
    List<TOrder> findAll();
    
    int delete(Long id);
  

}