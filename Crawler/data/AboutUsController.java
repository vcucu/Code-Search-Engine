8
https://raw.githubusercontent.com/nataraz123/Spring/master/MVCProj8-WishApp-AC-HandlerMappings/src/com/nt/controller/AboutUsController.java
package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class AboutUsController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		return new ModelAndView("show_about_us");
	}

}