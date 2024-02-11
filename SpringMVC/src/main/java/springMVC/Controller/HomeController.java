package springMVC.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*	We can use @RequestMapping annotation in 2 ways:-
 * 		1) Using Method the url will be (http://localhost:8080/SpringMVC/home)
 * 		2) Using Class the url will be (http://localhost:8080/SpringMVC/First/home)
 *	When using with class then url of the class i.e 'First' will come before the method url '/home'
 *
 * 	If we are using @RequestMapping with class then with the method we must follow the syntax below
 * 		@RequestMapping(path/value = "/home" , method = RequestMethod.GET/POST/DELETE/....x)
 * */


@Controller								// Have to  add to make it enable in Spring-servlet.xml
@RequestMapping("/First")
public class HomeController 
{
	@RequestMapping("/home")			// This method will get called when it finds the /home in url
	public String home()				// and return "home"(prefix) as a view name to viewResolver bean and
	{									// viewResolver will add suffix to it which is .jsp
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("name", "Sunpreet Singh");
		model.addAttribute("id", 101);
		model.addAttribute("city", "New Delhi");
		
		List<String> f = new ArrayList<String>();
		f.add("Sunpreet");
		f.add("Sunny");
		f.add("Singh");
		
		model.addAttribute("f", f);
		
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name", "Sunpreet Singh");
		modelandview.addObject("contact", 911001 );
		modelandview.setViewName("help");
		
		LocalDateTime time = LocalDateTime.now();
		modelandview.addObject("time" , time);
		return modelandview;
	}
	
}
