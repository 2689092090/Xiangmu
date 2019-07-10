package cn.appinfodb.service.prev.devuser.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appinfodb.dao.prev.devuser.DevuserMapper;
import cn.appinfodb.entity.DevUser;
import cn.appinfodb.service.prev.devuser.DevUserServicedao;

@Service("devUserservice")
public class DevUserServiceimpl implements DevUserServicedao {
	
	@Resource(name="devuserMapper")
	private DevuserMapper devusermapper;
	@Override
	public DevUser denglu(DevUser user) {
		return devusermapper.denglu(user);
	}

}
