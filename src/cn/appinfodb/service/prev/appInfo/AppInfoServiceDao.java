package cn.appinfodb.service.prev.appInfo;

import java.util.List;

import cn.appinfodb.entity.AppCategory;
import cn.appinfodb.entity.AppInfo;

public interface AppInfoServiceDao {
	List<AppInfo> chaxun(String name,int type,int pintai,
			int yiji,int erji,int sanji,int backsize);
	
	int count(String name,int type,int pintai,
			int yiji,int erji,int sanji);
}
