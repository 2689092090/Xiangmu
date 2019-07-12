package cn.appinfodb.service.prev.appcategory.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appinfodb.dao.prev.appcategory.AppcategoryMapper;
import cn.appinfodb.entity.AppCategory;
import cn.appinfodb.service.prev.appcategory.AppcategoryServiceDao;

@Service("appcategorservice")
public class AppcategoryServiceImpl implements AppcategoryServiceDao {
	
	@Resource
	private AppcategoryMapper appcategorMapper;
	@Override
	public List<AppCategory> chayiji() {
		return appcategorMapper.chayiji();
	}
	@Override
	public List<AppCategory> chaerji(int id) {
		return appcategorMapper.chaerji(id);
	}

}
