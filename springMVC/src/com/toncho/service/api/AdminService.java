package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;

public interface AdminService {

	List<TUser> findAllUsers();
	
	int find(TAdmin admin);
	
	List<TUser> findUsers(Criteria criteria);
}
