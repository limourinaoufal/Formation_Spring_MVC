package main.java.ma.lndroid.tp.controllers.hello.world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String redirectViewPage() {
		System.out.println("redirectViewPage");
		return "hello/word/viewpage";
	}

	@RequestMapping("/helloAgain")
	public String displayFinal() {
		System.out.println("displayFinal");
		return "hello/word/final";
	}

}
