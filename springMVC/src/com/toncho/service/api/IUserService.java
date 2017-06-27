package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TUser;

public interface IUserService {

	List<TUser> findAllUsers();
	
	List<TUser> findUsers(Criteria criteria);
	
	int find(TUser user);
	
	TUser findUser(TUser user);
	
	int save(TUser user);
	
	TUser findById(Long userId);
	
}
