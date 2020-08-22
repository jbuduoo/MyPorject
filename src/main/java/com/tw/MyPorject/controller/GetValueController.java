package com.tw.MyPorject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GetValueController {

	// 用uri傳參數
	// mapped to http://localhost:8080/home/name?name=jacky
	@RequestMapping(value = "/name")
	public String getName(@RequestParam("name") String name) {
		return "Hello " + name;
	}

	// 如果請求參數和處理方法參數的名稱一樣的話，@RequestParam 注解的 value 這個參數就可省掉了
	// mapped to localhost:8080/home/name2?name2=Anna
	@RequestMapping(value = "/name2")
	String getName2(@RequestParam String name2) {
		return "Hi   " + name2;
	}

	// @RequestParam注解的參數，required是否要傳參數值,defaultValue為預設值。
	// mapped to http://localhost:8080/home/name3?name3=ada
	// mapped to http://localhost:8080/home/name3?name3
	@RequestMapping(value = "/name3")
	String getName3(@RequestParam(value = "name3", required = false, defaultValue = "abbc") String name3) {
		return "Good morning " + name3;
	}

}
