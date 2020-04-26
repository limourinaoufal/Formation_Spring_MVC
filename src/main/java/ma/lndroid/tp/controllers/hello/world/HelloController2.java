package main.java.ma.lndroid.tp.controllers.hello.world;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 {
	

	@RequestMapping("/hello2")
	public String redirectViewPage() {
		System.out.println("redirectViewPage");
		return "hello/word/viewpage2";
	}

	@RequestMapping("/helloAgain2")
	public String displayFinal() {
		System.out.println("displayFinal");
		return "hello/word/final2";
	}

}
