package in.javahome.bootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BootWelcomeController {
	@RequestMapping(value="/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to Spring boot";
	}
}
