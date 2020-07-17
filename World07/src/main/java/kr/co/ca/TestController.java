package kr.co.ca;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	
	@RequestMapping(value = "/rt1", method = RequestMethod.GET)
	public void rt1() {
		
		
		@RequestMapping(value = "/rt2", method = RequestMethod.GET)
		public void rt2() {
	}
}
