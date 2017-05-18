package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.entity.TCart;
import com.toncho.dao.map.CartMap;


/**
 * @ClassName: TOrderMapper
 * @Description: t_user表对应的dao操作Mapper映射类
 */
public interface TCartMapper {

    int save(TCart cart);
    
    int delete(Long id);
    
    List<CartMap> findMapbyUserId(Long userId);

}