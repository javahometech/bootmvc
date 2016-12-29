package in.javahome.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome2")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring boot from different package";
	}
}
