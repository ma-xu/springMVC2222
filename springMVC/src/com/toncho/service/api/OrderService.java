package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.entity.TOrder;


public interface OrderService {
    
    int save(TOrder order);
    
    List<TOrder> findAll();
    
    int delete(Long id);

	
	
}
