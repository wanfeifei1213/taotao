package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * yemuan 
 * @author zhangbingquan
 *
 */
@Controller
public class PageController {
	/**
	 * 打开首页
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
		
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		
		return page;
	}

}
