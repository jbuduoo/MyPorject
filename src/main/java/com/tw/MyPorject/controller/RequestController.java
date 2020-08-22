package com.tw.MyPorject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class RequestController {

	    @RequestMapping(method = RequestMethod.GET)
	    public String get() {
	        return "RequestMethod.GET";
	    }
	    @RequestMapping(method = RequestMethod.DELETE)
	    public String delete() {
	        return "RequestMethod.DELETE";
	    }
	    @RequestMapping(method = RequestMethod.POST)
	    public String post() {
	        return "RequestMethod.POST";
	    }
	    @RequestMapping(method = RequestMethod.PUT)
	    public String put() {
	        return "RequestMethod.PUT";
	    }
	    @RequestMapping(method = RequestMethod.PATCH)
	    String patch() {
	        return "RequestMethod.PATCH";
	    }

}
