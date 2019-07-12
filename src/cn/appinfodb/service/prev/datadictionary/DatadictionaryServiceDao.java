package cn.appinfodb.service.prev.datadictionary;

import java.util.List;

import cn.appinfodb.entity.DataDictionary;

public interface DatadictionaryServiceDao {
	List<DataDictionary> zhuangtai();
	
	List<DataDictionary> pintai();     //查询平台
}
