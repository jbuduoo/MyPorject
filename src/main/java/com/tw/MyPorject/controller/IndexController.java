package com.tw.MyPorject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//加入依賴thymeleaf
//要用@GetMapping 取代 @RequestMapping，GetMapping 可在method層面上用作處理 http 的請求。
//要用@Controller 取代 @RestController
@Controller
public class IndexController {
	//將URL重定向到HTML文件
	@GetMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/x")
	public String hello(){
		return "Hey, Spring Boot 的 Hello World !";
	}

}
