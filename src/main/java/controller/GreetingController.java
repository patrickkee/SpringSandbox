package controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/welcome")
public class GreetingController {
 
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Welcome to Spring 3 MVC");
		return "hello"; 
	}
	
	@RequestMapping(value="/{message}", method = RequestMethod.GET)
	public String printWelcome(@PathVariable String message, ModelMap model) {
 
		model.addAttribute("message", "Hello "+message);
		return "hello"; 
	}
 
}