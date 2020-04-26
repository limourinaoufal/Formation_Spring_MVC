package main.java.ma.lndroid.tp.controllers.interfaces.http.servlet.request;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerRequest {
	
	private static String H_URL="interfaces/http/servlet/request/";
	
	@RequestMapping("/login")
	public String login(){
		return H_URL+"loginPage";
	}
	
	@RequestMapping("/authentification")
	public String display(HttpServletRequest req,Model model){
		
		String name = req.getParameter("name");
		String password = req.getParameter("pass");
		if(password.equalsIgnoreCase("admin")){
			String msg = "[ADMIN] - Hello "+name;
			model.addAttribute("message",msg);
			return H_URL+"adminHome";
		}else if (password.equalsIgnoreCase("client")){
			String msg = "[CLIENT] - Hello "+name;
			model.addAttribute("message",msg);
			return H_URL+"clientHome";
		}else{
			String msg="Sorry "+ name+". You entered an incorrect password";  
            model.addAttribute("message", msg);  
            return H_URL+"errorpage";  
		}
		
	}

}
