package com.toncho.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;
import com.toncho.dao.mapper.TAdminMapper;
import com.toncho.dao.mapper.TUserMapper;
import com.toncho.service.api.AdminService;
import com.toncho.service.api.IUserService;

@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService {

	@Resource
	private TUserMapper userMapper;
	
	@Resource
    private TAdminMapper adminMapper;
	
	

	@Override
	@Cacheable(value="userCache")
	public List<TUser> findAllUsers() {
		return userMapper.queryAllUsers();
	}
	
	@Override
	@Transactional
	public List<TUser> findUsers(Criteria criteria){
		TUser user = new TUser();
		user.setUserid(7L);
		user.setUsername("ttt");
		user.setPassword("pas");
		user.setAge(111);
		userMapper.deleteByPrimaryKey(5L);
		userMapper.insertSelective(user);
		return userMapper.selectByExample(criteria);
	}

    @Override
    public int find(TAdmin admin)
    {
        // TODO Auto-generated method stub
        return adminMapper.find(admin);
    }

}
