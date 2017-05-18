package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TUser;
import com.toncho.dao.mapper.TCouponMapper;
import com.toncho.dao.mapper.TUserMapper;
import com.toncho.service.api.CouponService;
import com.toncho.service.api.IUserService;

@Service("couponServiceImpl")
public class CouponServiceImpl implements CouponService {

	@Resource
	private TCouponMapper couponMapper;

	@Override
	
	public List<TCoupon> findAll() {
		return couponMapper.queryAll();
	}

    @Override
    public TCoupon getById(Long id)
    {
        // TODO Auto-generated method stub
        return couponMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(TCoupon coupon)
    {
        // TODO Auto-generated method stub
        return couponMapper.save(coupon);
        
    }

    @Override
    public int update(TCoupon coupon)
    {
        // TODO Auto-generated method stub
        return couponMapper.update(coupon);
    }

    @Override
    public int delete(Long couponID)
    {
        // TODO Auto-generated method stub
        return couponMapper.delete(couponID);
    }
	
//	@Override
//	@Transactional
//	public List<TUser> findUsers(Criteria criteria){
//		TUser user = new TUser();
//		user.setUserid(7L);
//		user.setUsername("ttt");
//		user.setPassword("pas");
//		user.setAge(111);
//		userMapper.deleteByPrimaryKey(5L);
//		userMapper.insertSelective(user);
//		return userMapper.selectByExample(criteria);
//	}

}
