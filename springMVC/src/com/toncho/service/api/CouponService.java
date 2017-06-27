package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TUser;

public interface CouponService {

	List<TCoupon> findAll();
	
	TCoupon getById(Long id);
	
	int save(TCoupon coupon);
	
	int update(TCoupon coupon);
	
	int delete(Long couponID);
	

	
	
}
