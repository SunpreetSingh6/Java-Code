package springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

	/*
	  	Redirecting can be done in 2 ways
	  	1) redirect prefix:
	  	2) RedirectView
	  	
	  	We can redirect anywhere outside the project or inside the project 
	*/


@Controller
public class RedirectingIController 
{
	@RequestMapping("/one")							// 1) Using redirect prefix
	public String one()
	{
		System.out.println("Inside the one");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/two")							// 2) Using RedirectView
	public RedirectView two()
	{
		System.out.println("Inside the two");
		RedirectView redirectView = new RedirectView();
		//redirectView.setUrl("https://www.google.com");
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String three()
	{
		System.out.println("Inside the enjoy");
		return "contact";
	}
	
	
}
