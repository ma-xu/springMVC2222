package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TUser;

/**
 * @ClassName: TCouponMapper
 * @Description: t_coupon表对应的dao操作Mapper映射类
 */
public interface TCouponMapper {

	List<TCoupon> queryAll();

	List<TCoupon> selectByExample(Criteria criteria);
	
	int deleteByPrimaryKey(Long couponID);
	
	
	TCoupon selectByPrimaryKey(Long couponID);
	
	int insertSelective(TCoupon coupon);
	
	int save(TCoupon coupon);
	
	int update(TCoupon coupon);
	
	int delete(Long couponID);
	

}