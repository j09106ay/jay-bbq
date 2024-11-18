package com.jay.bbq.menu_finalize.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/bbq/details")
@Log4j2
public class BBQController {
	
	
	@PostMapping
	public void saveBBQDetails() {
		log.info("Saving information");
	}

}
