package com.tw.MyPorject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPropertiesController {
	// 取得系統參數
	@Value("${com.jbuduoo.name}")
	String name;
	// 随机字符串
	@Value("${com.jbuduoo.value}")
	String value;
	// 随机int
	@Value("${com.jbuduoo.number}")
	String number;
	// 随机long
	@Value("${com.jbuduoo.bignumber}")
	String bignumber;
	// 10以内的随机数
	@Value("${com.jbuduoo.random1}")
	String random1;
	// 10-20的随机数
	@Value("${com.jbuduoo.random2}")
	String random2;

	@RequestMapping(path = "/getValue", method = RequestMethod.GET)
	public String good() {
		StringBuffer sb = new StringBuffer();
		sb.append("name:").append(name).append("|");
		sb.append("value:").append(value).append("|");
		sb.append("number:").append(number).append("|");
		sb.append("bignumber:").append(bignumber).append("|");
		sb.append("random<10:").append(random1).append("|");
		sb.append("random10-20:").append(random2);

		return sb.toString();
	}

	// List类型
	@Value("${list.jbuduoo.url}")
	private List<String> url;

	// 啟動應用後，輸入http://localhost:8080/list ，就可以看到”[A123456789, B987654321]”。
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList() {
		return url.toString();
	}

	// map
	@Value("#{${example.pet.name}}")
	private Map<String, String> pet;

	// 啟動應用後，輸入http://localhost:8080/map ，就可以看到”{cat=princess, dog=prince}”。
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String getMap() {
		return pet.toString();
	}
}
