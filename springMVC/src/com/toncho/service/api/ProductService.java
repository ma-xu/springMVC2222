package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;

public interface ProductService {

	List<TCoupon> findAll();
	
	List<TProduct> findByType(String type);
	
	TProduct getById(Long id);
	
	int save(TProduct product);
	
	int update(TProduct product);
	
	int delete(Long id);
	
	
}
