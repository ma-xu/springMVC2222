package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.toncho.dao.entity.TOrder;
import com.toncho.dao.mapper.TOrderMapper;
import com.toncho.service.api.OrderService;

@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {

    @Resource
    private TOrderMapper orderMapper;
    
    @Override
    public int save(TOrder order)
    {
        // TODO Auto-generated method stub
        return orderMapper.save(order);
    }

    @Override
    public List<TOrder> findAll()
    {
        // TODO Auto-generated method stub
        return orderMapper.findAll();
    }

    @Override
    public int delete(Long id)
    {
        // TODO Auto-generated method stub
        return orderMapper.delete(id);
    }

	
}
