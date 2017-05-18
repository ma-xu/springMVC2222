package com.toncho.dao.mapper;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;

/**
 * @ClassName: TUserMapper
 * @Description: t_user表对应的dao操作Mapper映射类
 */
public interface TAdminMapper {

	List<TUser> queryAllUsers();

	List<TUser> selectByExample(Criteria criteria);
	
	int deleteByPrimaryKey(Long userID);
	
	int insertSelective(TUser user);
	
	int find(TAdmin admin);

}