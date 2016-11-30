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
import com.psb.model.Category;
import com.psb.model.Product;
import com.psb.model.Supplier;
import com.psb.service.CategoryService;
import com.psb.service.ProductService;
import com.psb.service.SupplierService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping(value = "/Add", method = RequestMethod.GET)
	public String listProducts(@ModelAttribute("product") Product product, Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList", this.productService.list());
		model.addAttribute("categoryList", this.categoryService.list());
		model.addAttribute("supplierList", this.supplierService.list());
		return "ManageProduct";
	}

	@RequestMapping(value = "/myproduct", method = RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product") Product product, HttpServletRequest request) {
		System.out.println("in product modelAttribute controller");

		@SuppressWarnings("unused")
		String filename;
		@SuppressWarnings("unused")
		byte[] bytes;
		System.out.println(product.getProductname());

		System.out.println("image uploaded");

		System.out.println("myproduct controller called");
		MultipartFile image = product.getImg();
		Path path;
		path = Paths.get("G:/webappworkspace/fruitcartweb/src/main/webapp/resources/images/" 
				+ product.getProductname() + ".jpg");

		System.out.println("Path = " + path);
		System.out.println("File name = " + product.getImg().getOriginalFilename());
		if (image != null && !image.isEmpty()) {
			try {
				image.transferTo(new File(path.toString()));
				System.out.println("Image Saved in:" + path.toString());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Image not saved");
			}
		}
		Supplier supplier = supplierService.getByName(product.getSupplier().getSuppliername());
		supplierService.saveOrUpdate(supplier);

		Category category = categoryService.getByName(product.getCategory().getCategoryname());
		categoryService.saveOrUpdate(category);

		product.setCategory(category);
		product.setSupplier(supplier);

		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());

		productService.saveOrUpdate(product);

		return "ManageProduct";

	}

	@RequestMapping("/product")
	public ModelAndView viewItems() throws JsonGenerationException, JsonMappingException, IOException {
		List<Product> list = productService.list();
		System.out.println("user list=" + list);
		ObjectMapper om = new ObjectMapper();
		String listjson = om.writeValueAsString(list);
		System.out.println(listjson);
		return new ModelAndView("product", "listofitem", listjson);
	}

	@RequestMapping("/deleteproduct")
	public String removeProduct(@RequestParam int id) throws Exception {
		System.out.println(" delete successfully");
		System.out.println(id);

		try {
			productService.delete(id);
			// model.addAttribute("message", "Successfully Added");
		} catch (Exception e) {
			// model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		// redirectAttrs.addFlashAttribute(arg0, arg1)
		return "ManageProduct";
	}

	@RequestMapping("/editproduct")
	public ModelAndView editItem(@RequestParam("id") int id) {
		System.out.println("id:" + id);
		Product product = productService.get(id);
		System.out.println("Product Name:" + product.getProductname());
		return new ModelAndView("ManageProduct", "product", product);
	}

	
	@RequestMapping("/viewDetail")
	public ModelAndView productViewDetails(@RequestParam("id") int id) {
		System.out.println("I am in productViewDetails");
		System.out.println("ID:" + id);
		
		Product product = productService.get(id);
		return new ModelAndView("ViewDetails", "product", product);
	}

	String setName;
	List<Product> plist;

	@SuppressWarnings("unchecked")
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues() throws Exception {
		String result = "";
		plist = productService.list();
		Gson gson = new Gson();
		result = gson.toJson(plist);
		return result;

	}

}









