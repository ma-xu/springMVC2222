package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TCoupon;
import com.toncho.dao.entity.TProduct;
import com.toncho.dao.entity.TUser;
import com.toncho.dao.mapper.TCouponMapper;
import com.toncho.dao.mapper.TProductMapper;
import com.toncho.dao.mapper.TUserMapper;
import com.toncho.service.api.CouponService;
import com.toncho.service.api.IUserService;
import com.toncho.service.api.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Resource
	private TCouponMapper couponMapper;
	
	
	@Resource
    private TProductMapper productMapper;

	@Override
	
	public List<TCoupon> findAll() {
		return couponMapper.queryAll();
	}

    @Override
    public TProduct getById(Long id)
    {
        // TODO Auto-generated method stub
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(TProduct product)
    {
        // TODO Auto-generated method stub
        return productMapper.save(product);
    }

    @Override
    public int update(TProduct product)
    {
        // TODO Auto-generated method stub
        return productMapper.update(product);
    }

    @Override
    public int delete(Long id)
    {
        // TODO Auto-generated method stub
        return productMapper.delete(id);
    }

    

    @Override
    public List<TProduct> findByType(String type)
    {
        // TODO Auto-generated method stub
        return productMapper.findByType(type);
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
