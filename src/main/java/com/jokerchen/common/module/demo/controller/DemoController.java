package com.jokerchen.common.module.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;



@Data
@Slf4j
@Controller
@RequestMapping("/")
public class DemoController {

	
	@RequestMapping("toIndex")
	public String toIndex() {
		log.info("toIndex");
		return "index";
	}
}
