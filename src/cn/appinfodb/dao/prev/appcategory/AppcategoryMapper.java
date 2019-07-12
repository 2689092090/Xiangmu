package cn.appinfodb.dao.prev.appcategory;

import java.util.List;

import cn.appinfodb.entity.AppCategory;

public interface AppcategoryMapper {
	List<AppCategory> chayiji();
	
	List<AppCategory> chaerji(int id);
}
