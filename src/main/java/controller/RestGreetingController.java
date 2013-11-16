package controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/rest")
public class RestGreetingController {
 
	@RequestMapping(value = "/{message}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String message, ModelMap model) {
 
		model.addAttribute("message", "Hello "+message);
		return "hello";
 
	}
 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		model.addAttribute("message", "Hello");
		return "hello";
 
	}
 
}