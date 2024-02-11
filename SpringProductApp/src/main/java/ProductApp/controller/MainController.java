package ProductApp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import ProductApp.dao.ProductDao;
import ProductApp.model.Product;


@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		List<Product> products = this.productDao.getProducts();
		model.addAttribute("products", products);
		return "home";
	}
	
	@RequestMapping("/add_product")
	public String addProduct(Model model)
	{
		model.addAttribute("title", "Add Product");
		return "add_product";
	}
	
	@RequestMapping(path = "/handle_product" , method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product , HttpServletRequest request )
	{
		this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		
			// Context path is used so that we can get the name of the project
			// If we don't use context path and we click on back button then it will take us to(localhost:8080/)
			// While using context path if we click on back button then it will take us to(localhost:8080/name_of_project/)
			// using this we can easily go to home page which is(localhost:8080/SpringProductApp/)
		
		redirectView.setUrl(request.getContextPath() + "/");				
		return redirectView;
	}
	
	@RequestMapping(path = "/update_product" , method = RequestMethod.POST)
	public RedirectView updateProduct(@ModelAttribute Product product , HttpServletRequest request )
	{
		this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	// @PathVariable annotation i used to bind url template variable to our local variable
	
	@RequestMapping("/delete_product/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId , HttpServletRequest request )
	{
		this.productDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}
	
	@RequestMapping("/update_product/{productId}")
	public String updateProduct(@PathVariable("productId") int productId , Model model)
	{
		Product product = this.productDao.getProduct(productId);
		model.addAttribute("product" , product);
		return "update_product";
	}

}
