package cn.appinfodb.service.prev.appcategory;

import java.util.List;

import cn.appinfodb.entity.AppCategory;

public interface AppcategoryServiceDao {
	List<AppCategory> chayiji();
	
	List<AppCategory> chaerji(int id);
}
