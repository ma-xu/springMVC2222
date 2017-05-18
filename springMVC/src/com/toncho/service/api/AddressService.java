package com.toncho.service.api;

import java.util.List;

import com.toncho.dao.Criteria;
import com.toncho.dao.entity.TAddress;
import com.toncho.dao.entity.TAdmin;
import com.toncho.dao.entity.TUser;

public interface AddressService {

    int save(TAddress address);
    
    int delete(Long id);
    
    List<TAddress> findMapbyUserId(Long userId);
}
