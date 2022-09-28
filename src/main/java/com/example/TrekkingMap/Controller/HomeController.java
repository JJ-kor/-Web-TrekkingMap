package com.example.TrekkingMap.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.TrekkingMap.Entity.Coord;
import com.example.TrekkingMap.Service.CoordService;
import com.example.TrekkingMap.Service.MapService;
import com.example.TrekkingMap.Service.MemberMapService;
import com.example.TrekkingMap.Service.MemberService;
import com.example.TrekkingMap.Service.PostService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
public class HomeController {

	@Autowired
	CoordService coordService;

	@Autowired
	MapService mapService;

	@Autowired
	MemberMapService memberMapService;

	@Autowired
	MemberService memberService;

	@Autowired
	PostService postService;

	@GetMapping("/test")
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

	@PostMapping("/addition")
	public String additionPost(@RequestBody HashMap<String, Object> param) {
		System.out.println(param);

		String name = (String) param.get("name");
		String start = (String) param.get("start");
		String dest = (String) param.get("dest");
		String dist = (String) param.get("dist");
		Object routes = param.get("routes");

		System.out.println(name + " / " + start + " / " + dest + " / " + dist);

		Gson gson = new Gson();
		List<Coord> coords = gson.fromJson(routes.toString(), new TypeToken<List<Coord>>() {
		}.getType());
		System.out.println(coords);

		return "redirect:/addition";
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
