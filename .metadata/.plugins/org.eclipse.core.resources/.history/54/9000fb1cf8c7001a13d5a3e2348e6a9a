package kr.co.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show() {
		return "show";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}@RequestMapping(value="/list", method = RequestMethod.GET)
	public void list(){
		
	}
	

	@RequestMapping(value="/insert", method = RequestMethod.GET)
	public String insert(Model model, String name){

		name = toKor(name);
		
		model.addAttribute("name", name);
		
		return "insert";
	}
	
	
	
	private String toKor(String name) {
		// TODO Auto-generated method stub
		try {
			return new String(name.getBytes("8859_1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
