package cn.appinfodb.controller.prev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prev")
public class DevuserController {
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "devlogin";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "applist";
	}
}
