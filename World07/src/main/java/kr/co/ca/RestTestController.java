package kr.co.ca;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	
	@RequestMapping(value = "rt2", method = RequestMethod.POST)
	public Map<String, Object> rt2(@RequestBody Map<String, Object> map) {
		System.out.println("test1");
		System.out.println("test2");
		return map;
	}
	
	
	
	
	
	
	@RequestMapping(value = "rt1", method = RequestMethod.POST)
	public String rt1(@RequestBody String test1) {
		System.out.println(test1);
		
		return "ok";
	}
}
