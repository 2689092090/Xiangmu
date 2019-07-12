package cn.appinfodb.service.prev.datadictionary.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appinfodb.dao.prev.datadictionary.DatadictionaryMapper;
import cn.appinfodb.entity.DataDictionary;
import cn.appinfodb.service.prev.datadictionary.DatadictionaryServiceDao;

@Service("datadictionaryservice")
public class DatadictionaryServiceImpl implements DatadictionaryServiceDao {
	
	@Resource
	private DatadictionaryMapper datadictionaryMapper;
	@Override
	public List<DataDictionary> zhuangtai() {
		return datadictionaryMapper.zhuangtai();
	}
	@Override
	public List<DataDictionary> pintai() {
		return datadictionaryMapper.pintai();
	}

}
