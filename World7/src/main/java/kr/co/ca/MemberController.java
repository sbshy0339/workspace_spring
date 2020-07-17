package kr.co.ca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.domain.LoginDTO;
import kr.co.domain.MemberDTO;
import kr.co.service.MemberService;

@Controller
@RequestMapping("member")
@SessionAttributes({"id", "pw"})
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/logout" , method = RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		
		return "redirect:/member/list";
		
	}

	
	@RequestMapping(value = "/loginpost" , method = RequestMethod.POST)
	public String loginpost(LoginDTO login, Model model) {
		
		MemberDTO dto = memberService.loginpost(login);
		if(dto != null) {
			model.addAttribute("login", dto);			
			return "redirect:/member/list";
		} else {
			return "redirect:/member/login";
		}
		
		
		
	}
	
	
	

}
