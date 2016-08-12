package com.psb.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.psb.model.Product;
import com.psb.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	Product product;

	@RequestMapping(value = "/AddProduct", method = RequestMethod.GET)
	public String AddProductcontroller(Model model) {

		model.addAttribute("product", new Product());
		System.out.println("my addproduct controller called");
		return "AddProduct";
	}

	@RequestMapping(value = "/myproduct", method = RequestMethod.POST)
	public String CreateProduct(@ModelAttribute("product") Product product, Model model, BindingResult result,
			@RequestParam("img") MultipartFile file, HttpServletRequest reqeust) throws IOException {
		System.out.println("in product controller");
		String filename;
		byte[] bytes;

		productService.saveOrUpdate(product);

		System.out.println("Prodsuct controller called");
		System.out.println("image");
		MultipartFile image = product.getImg();
		Path path;
		path = Paths.get(
				"G://webappworkspace//fruitcartweb//src//main//webapp//resources//images//" + product.getId() + ".jpg");
		System.out.println("Path =img " + path);
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
		return "AddProduct";
	}
}
