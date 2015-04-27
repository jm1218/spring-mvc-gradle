package kr.co.jong.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jong on 4/28/15.
 */
@Controller
public class HomeCtrl {

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
}
