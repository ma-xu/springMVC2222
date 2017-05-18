package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TAddress;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;
import com.toncho.dao.mapper.TAddressMapper;
import com.toncho.dao.mapper.TAdminMapper;
import com.toncho.dao.mapper.TUserMapper;
import com.toncho.service.api.AddressService;
import com.toncho.service.api.AdminService;
import com.toncho.service.api.IUserService;

@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService {

    @Resource
    private TAddressMapper addressMapper;
    
    @Override
    public int save(TAddress address)
    {
        // TODO Auto-generated method stub
        return addressMapper.save(address);
    }

    @Override
    public int delete(Long id)
    {
        // TODO Auto-generated method stub
        return addressMapper.delete(id);
    }

    @Override
    public List<TAddress> findMapbyUserId(Long userId)
    {
        // TODO Auto-generated method stub
        return addressMapper.findMapbyUserId(userId);
    }

	

}
