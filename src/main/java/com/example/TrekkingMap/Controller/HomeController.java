package com.example.TrekkingMap.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("test")
	public String testGet() {
		return "/test";
	}
	
	@GetMapping("/")
	public String indexGet() {
		return "/index";
	}
	
	@GetMapping("/main")
	public String mainGet() {
		return "/sub_sidebar/main";
	}
	
	@GetMapping("/addition")
	public String additionGet() {
		return "/sub_sidebar/addition";
	}
	
	@GetMapping("/mod")
	public String modGet() {
		return "/sub_sidebar/mod";
	}
	
	@GetMapping("/notice")
	public String noticeGet() {
		return "/sub_sidebar/notice";
	}
		
	@GetMapping("/etc")
	public String etcGet() {
		return "/sub_sidebar/etc";
	}
	
	@GetMapping("/main_detail")
	public String mainDetailGet() {
		return "/sub_sub_sidebar/main_detail";
	}
}
