package SpringSearchApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController 
{
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("query") String q)
	{
		String url = "https://www.google.com/search?q=" + q;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
}
