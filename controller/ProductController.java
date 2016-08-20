package com.psb.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.psb.model.Product;
import com.psb.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService; 
	
	@RequestMapping("/Add")
	public ModelAndView displayHomePage(@ModelAttribute("product")Product product){
		System.out.print("\nMyController - displayHomePage as landpage()");
		System.out.println(product.getQuantity());
		ModelAndView mv = new ModelAndView("ManageProduct");		
		return mv;
	}
	
	@RequestMapping(value="/myproduct", method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product")Product product,HttpServletRequest request)
	{
	System.out.println("in product controller11");

	    @SuppressWarnings("unused")
	    String filename;
	    @SuppressWarnings("unused")
	    byte[]bytes;
	    System.out.println(product.getProductname());
	    
	    
	        System.out.println("image uploaded");
	        


	System.out.println("product controller called");
	MultipartFile image=product.getImg();
	Path path;
	path=Paths.get("G:/webappworkspace/fruitcartweb/src/main/webapp/resources/images"+product.getProductname() +".jpg");

	System.out.println("Path = " + path);
	System.out.println("File name = " + product.getImg().getOriginalFilename());
	if(image!=null && !image.isEmpty())
	{
	    try
	    {
	     image.transferTo(new File(path.toString()));
	      System.out.println("Image Saved in:"+path.toString());
	    }catch(Exception e)
	    {
	e.printStackTrace();
	        System.out.println("Image not saved");
	    }
	}

	productService.saveOrUpdate(product);

	return "product";


	}



	

	
	/*@RequestMapping(value="/myproduct", method=RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product")Product pd,HttpServletRequest request)
	{		
	 	System.out.println("in product jsp controller called");

		//String filename;
	 	byte[]bytes;
	 	System.out.println(pd.getProductname());
	 	
	 	try{
	 		bytes=pd.getImg().getBytes();
	 		String path = request.getSession().getServletContext().getRealPath("/resources/images/" + pd.getProductname()+".jpg");
	 		System.out.println("\nPath : " + path);
	 		System.out.println("\nFilename : " + pd.getImg().getOriginalFilename());
	 		File f= new File(path);
	 		BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(f));
	 		bs.write(bytes);
	 		bs.close();
	 		System.out.println("image uploaded");
	 		
	 	}
	 	catch(Exception ex){
	 		System.out.println("\nExcep - " + ex);
	 	}
	 	productService.saveOrUpdate(pd);
	 	
	 	
	 	return "ManageProduct";
	 	}*/
	
	@RequestMapping("/product")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Product> list = productService.list();
		System.out.println("user list="+list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("product","listofitem",listjson);
	}
	
	@RequestMapping("deleteproduct")
	public String removeProduct(@RequestParam int id) throws Exception {
	System.out.println(" delete successfully");
	System.out.println(id);

	    try {
	        productService.delete(id);
	      //  model.addAttribute("message", "Successfully Added");
	    } catch (Exception e) {
	     //   model.addAttribute("message", e.getMessage());
	        e.printStackTrace();
	    }
	    // redirectAttrs.addFlashAttribute(arg0, arg1)
	    return "redirect:/product";
	}
	@RequestMapping("/editproduct")
	public ModelAndView editItem(@RequestParam("id") int id)
	{
	System.out.println("id:"+id);
	Product product=productService.get(id);
	System.out.println("Product Name:"+product.getProductname());
	return new ModelAndView("ManageProduct","product",product);
	}
	
	String setName;
	List<Product> plist;
	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()throws Exception
	{
		String result = "";
			plist = productService.list();
			Gson gson = new Gson();			  
			result = gson.toJson(plist);			
			return result;
	}
	/*@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")EmployeeBean employeeBean,
	   BindingResult result) {
	  employeeService.deleteEmployee(prepareModel(employeeBean));
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("employee", null);
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("addEmployee", model);
	 }
	 
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")EmployeeBean employeeBean,
	   BindingResult result) {
	  Map<String, Object> model = new HashMap<String, Object>();
	  model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
	  model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
	  return new ModelAndView("addEmployee", model);
	 }*/

	
}
	