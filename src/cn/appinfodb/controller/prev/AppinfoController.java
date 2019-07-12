package cn.appinfodb.controller.prev;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import cn.appinfodb.entity.AppCategory;
import cn.appinfodb.entity.AppInfo;
import cn.appinfodb.entity.DataDictionary;
import cn.appinfodb.entity.Fenye;
import cn.appinfodb.service.prev.appInfo.AppInfoServiceDao;
import cn.appinfodb.service.prev.appcategory.AppcategoryServiceDao;
import cn.appinfodb.service.prev.datadictionary.DatadictionaryServiceDao;

@Controller
@RequestMapping("/prev")
public class AppinfoController {
	
	@Resource
	private AppInfoServiceDao dao;
	
	@Resource
	private DatadictionaryServiceDao dicdao;
	
	@Resource
	private AppcategoryServiceDao catedao;
	
	@RequestMapping("chaxun")
	public Object chaxun(Model model,@RequestParam(value="querySoftwareName",required=false)String name,
			@RequestParam(value="queryStatus",required=false,defaultValue="0")Integer type,
			@RequestParam(value="queryFlatformId",required=false,defaultValue="0")Integer pintai,
			@RequestParam(value="queryCategoryLevel1",required=false,defaultValue="0")Integer yiji,
			@RequestParam(value="queryCategoryLevel2",required=false,defaultValue="0")Integer erji,
			@RequestParam(value="queryCategoryLevel3",required=false,defaultValue="0")Integer sanji,
			@RequestParam(value="pageIndex",required=false)Integer backsize) {
		Fenye fen = new Fenye();
		fen.setZongshu(dao.count(name, type, pintai, yiji, erji, sanji));
		if(backsize != null) {
			fen.setYe(backsize);
		}
		List<AppInfo> list = dao.chaxun(name, type, pintai, yiji, erji, sanji, (fen.getYe()-1)*5);    //app信息记录
		List<DataDictionary> zhuangtai = dicdao.zhuangtai();
		List<DataDictionary> pintai2 = dicdao.pintai();     //查询到的平台信息
		List<AppCategory> chayiji = catedao.chayiji();
		model.addAttribute("statusList",zhuangtai);
		model.addAttribute("categoryLevel1List",chayiji);
		model.addAttribute("flatFormList",pintai2);
		model.addAttribute("fen",fen);
		model.addAttribute("querySoftwareName",name);
		model.addAttribute("queryStatus",type);
		model.addAttribute("queryFlatformId",pintai);
		model.addAttribute("queryCategoryLevel1",yiji);
		model.addAttribute("queryCategoryLevel2",erji);
		model.addAttribute("queryCategoryLevel3",sanji);
		model.addAttribute("appInfoList",list);
		return "appinfolist";
	}
	
	@RequestMapping(value="erji",method=RequestMethod.GET)
	@ResponseBody
	public Object erjicaidan(@RequestParam(value="pid",required=false)Integer yiji,Model model) {
		List<AppCategory> chaerji = catedao.chaerji(yiji);
		model.addAttribute("categoryLevel2List",chaerji);
		return JSON.toJSONString(chaerji);
	}
}
