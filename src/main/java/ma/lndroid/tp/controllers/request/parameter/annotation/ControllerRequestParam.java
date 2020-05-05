package main.java.ma.lndroid.tp.controllers.request.parameter.annotation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerRequestParam {
	
	private static String H_URL="request/parameter/annotation/";
	
	@RequestMapping("/loginReqParam")
	public String login(){
		return H_URL+"loginPage";
	}
	
	@RequestMapping("/authentificationReqParam")
	public String display(@RequestParam("name") String name, @RequestParam("pass") String password, Model model ){
	
		if(password.equalsIgnoreCase("admin")){
			String msg = "[ADMIN] - Hello "+name;
			model.addAttribute("message",msg);
			return H_URL+"adminHome";
		}else if (password.equalsIgnoreCase("client")){
			String msg = "[CLIENT] - Hello "+name;
			model.addAttribute("message",msg);
			return H_URL+"clientHome";
		}else{
			String msg="Sorry "+ name+". You entered an incorrect password -> mdp : ADMIN / CLIENT";  
            model.addAttribute("message", msg);  
            return H_URL+"loginPage";  
		}
		
	}

}
