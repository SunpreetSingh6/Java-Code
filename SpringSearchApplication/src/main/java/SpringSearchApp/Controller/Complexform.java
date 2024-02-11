package SpringSearchApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Complexform 
{
	@RequestMapping("/complexform")
	public String showform()
	{
		return "complexform";
	}
	
	@RequestMapping(path = "/handle" , method = RequestMethod.POST)
	public String handleform(@ModelAttribute("user") User user , BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complexform";
		}
		
		System.out.println(user);
		return "success";
	}
	
}
