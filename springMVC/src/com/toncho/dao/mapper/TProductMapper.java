package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;

/**
 * @ClassName: TProductMapper
 * @Description: t_product表对应的dao操作Mapper映射类
 */
public interface TProductMapper {

	List<TCoupon> queryAll();

	List<TProduct> findByType(String type);
	
	int deleteByPrimaryKey(Long couponID);
	
	
	TProduct selectByPrimaryKey(Long couponID);
	
	int insertSelective(TCoupon coupon);
	
	int save(TProduct product);
	
	
	int update(TProduct product);
	
	int delete(Long id);
	

}