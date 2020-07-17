package kr.co.ca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxTestController {

	
	@RequestMapping(value = "at1", method = RequestMethod.GET)
	public void at1() {
		
	}
}
