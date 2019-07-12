package cn.appinfodb.service.prev.appInfo.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appinfodb.dao.prev.appInfo.AppInfoMapper;
import cn.appinfodb.entity.AppCategory;
import cn.appinfodb.entity.AppInfo;
import cn.appinfodb.service.prev.appInfo.AppInfoServiceDao;

@Service("appinfoservice")
public class AppInfoServiceImpl implements AppInfoServiceDao{
	
	@Resource
	private AppInfoMapper appinfoMapper;
	@Override
	public List<AppInfo> chaxun(String name, int type, int pintai, int yiji, int erji, int sanji, int backsize) {
		return appinfoMapper.chaxun(name, type, pintai, yiji, erji, sanji, backsize);
	}
	@Override
	public int count(String name, int type, int pintai, int yiji, int erji, int sanji) {
		return appinfoMapper.count(name, type, pintai, yiji, erji, sanji);
	}
}
