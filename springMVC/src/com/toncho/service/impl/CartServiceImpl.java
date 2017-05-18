package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toncho.dao.entity.TCart;
import com.toncho.dao.map.CartMap;
import com.toncho.dao.mapper.TCartMapper;
import com.toncho.service.api.CartService;

@Service("cartServiceImpl")
public class CartServiceImpl implements CartService {

	@Resource
	private TCartMapper cartMapper;

    @Override
    public int save(TCart cart)
    {
        // TODO Auto-generated method stub
        return cartMapper.save(cart);
    }

    @Override
    public List<CartMap> findMapbyUserId(Long userId)
    {
        // TODO Auto-generated method stub
        return cartMapper.findMapbyUserId(userId);
    }

    @Override
    public int delete(Long id)
    {
        // TODO Auto-generated method stub
        return cartMapper.delete(id);
    }

	

}
