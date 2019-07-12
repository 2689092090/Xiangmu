package cn.appinfodb.dao.prev.datadictionary;

import java.util.List;

import cn.appinfodb.entity.DataDictionary;

public interface DatadictionaryMapper {
	List<DataDictionary> zhuangtai();    //查询状态
	
	List<DataDictionary> pintai();     //查询平台
}
