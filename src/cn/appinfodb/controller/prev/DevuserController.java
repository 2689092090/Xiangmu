package cn.appinfodb.controller.prev;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appinfodb.entity.DevUser;
import cn.appinfodb.service.prev.devuser.DevUserServicedao;

@Controller
@RequestMapping("/prev")
public class DevuserController {
	@Resource
	private DevUserServicedao dao;
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "devlogin";
	}
	
	@RequestMapping("/dologin")
	public String dologin(@RequestParam("devCode")String devCode,
			@RequestParam("devPassword")String devPassword,HttpSession session) {
		DevUser user = dao.denglu(devCode,devPassword);
		if(user != null) {
			session.setAttribute("devUserSession", user);
			return "main";
		}else {
			throw new RuntimeException("账号或者密码错误!");
		}
	}
	
	@ExceptionHandler(value= {RuntimeException.class})
	public String yichan(RuntimeException e,HttpServletRequest request) {
		request.setAttribute("e", e);
		return "devlogin";
	}
	
}
