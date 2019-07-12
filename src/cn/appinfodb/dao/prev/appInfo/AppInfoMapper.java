package cn.appinfodb.dao.prev.appInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.entity.AppCategory;
import cn.appinfodb.entity.AppInfo;

public interface AppInfoMapper {
	List<AppInfo> chaxun(@Param("name")String name,@Param("type")int type,@Param("pintai")int pintai,
			@Param("yiji")int yiji,@Param("erji")int erji,@Param("sanji")int sanji,@Param("backsize")int backsize);
	
	int count(@Param("name")String name,@Param("type")int type,@Param("pintai")int pintai,
			@Param("yiji")int yiji,@Param("erji")int erji,@Param("sanji")int sanji);
}
