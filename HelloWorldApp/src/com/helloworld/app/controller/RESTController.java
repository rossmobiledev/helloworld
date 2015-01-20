package com.helloworld.app.controller;

import java.net.URISyntaxException;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.app.model.NewsItem;
import com.helloworld.app.util.HelperUtils;


@RestController
public class RESTController {
	
	@RequestMapping(value="/newsfeed")
	public String homePage(ModelMap model) throws URISyntaxException {
		return (new HelperUtils()).getJsonFile("newsfeed.json");
		
		/*NewsItem[] items = new NewsItem[1];
		items[0] = new NewsItem();
		return items[0];*/
		
	}
	
}
