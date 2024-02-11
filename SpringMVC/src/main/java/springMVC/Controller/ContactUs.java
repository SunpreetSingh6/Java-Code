package springMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.Model.User;
import springMVC.Service.UserService;

@Controller
public class ContactUs 
{
	@Autowired
	private UserService userservice;
	
	@ModelAttribute
	public void Message(Model model)
	{
		model.addAttribute("Msg", "Hey Welcome To My Page");
		model.addAttribute("description", "Here you will find some owesome content");
	}
	
	@RequestMapping("/contact")
	public String contactus(Model model)
	{	
		// As we are writing this data in 2 or many methods , Instead what we can do is make a method and use
		// @ModelAttribute . This method will be called before every handler method.
	/*
		model.addAttribute("Msg", "Hey Welcome To My Page");
		model.addAttribute("description", "Here you will find some owesome content");
	*/	
		return "contact";
	}
	
/*	Using @RequestParam annotation
 
	@RequestMapping(path = "/processcontactus", method = RequestMethod.POST)
	public String processcontactus(
			@RequestParam("username") String username,
			@RequestParam("email") String useremail,
			@RequestParam("password") String userpass,
			Model model 	)
	{
	//	Instead we can make one class with the same fields in the form, and then we can set that object.
	//  model.addAttribute("name", username);
	//	model.addAttribute("email", useremail);
	//	model.addAttribute("password", userpass); 
	
		User user = new User();
		user.setUsername(username);
		user.setEmail(useremail);
		user.setPassword(userpass);
		model.addAttribute(user);
		
		return "success";
	}
*/

//	Using @ModelAttribute
	
	@RequestMapping(path="/processcontactus" , method = RequestMethod.POST )
	public String processcontactus(@ModelAttribute User user , Model model )
	{
		// Mapping will be done between form fields and the class variables automatically.
		// Form field name and class variable name must match.
	/*
		model.addAttribute("Msg", "Hey Welcome To My Page");
		model.addAttribute("description", "Here you will find some owesome content");
	*/
		this.userservice.createUser(user);
		return "success";
	}
}
