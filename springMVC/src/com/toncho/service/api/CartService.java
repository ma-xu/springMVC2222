package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.entity.TCart;
import com.toncho.dao.map.CartMap;



public interface CartService {
    
    int save(TCart cart);
    
    int delete(Long id);
    
    List<CartMap> findMapbyUserId(Long userId);
	
	
	
}
