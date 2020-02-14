package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.IProductDao;
import com.cts.training.mavenweb.entity.Product;
import com.cts.training.mavenweb.services.IProductService;

@Controller
@RequestMapping("/student")
public class StudentController {

	// dependency
	/*@Autowired
	private IStudentDao studentDao;*/
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		// List<Student> students = this.studentDao.findAll();
		List<Product> products = this.productService.findAllStudents();
		
		// add to model object
		model.addAttribute("students", products);
		
		// return the view page
		return "student-list";
	}
	
	@RequestMapping("/entry")
	public String entry(Model model) {
		
		Product product = new Product(); // empty bag
		
		// add empty bag to model , to be mapped with spring form
		model.addAttribute("student", product);
		
		return "student-entry";
	}
	
	@RequestMapping("/save")  // ALL TYPES OF HTTP VERB
	public String save(@ModelAttribute Product product) {
		// add validation
		
		// send student object to DAO via SERVICE
		this.productService.addStudent(product);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
		
		// send id to DAO via SERVICE and get the student object to edit
		Product product = this.productService.findStudentById(id);
		
		// add student to model , to be mapped with spring form
		model.addAttribute("student", product);
		
		return "student-update";
	}
	
	
	// Path Variable
		@RequestMapping("/delete/{studentId}")
		public String delete(@PathVariable Integer studentId) {
			// send studentId to DAO via SERVICE
			this.productService.deleteStudent(studentId);
			
			// terminate the original request and start a new one
			
			// redirect to /all
			// return a redirect url
			return "redirect:/student/all";
		}
	
	@RequestMapping("/save-update")
	public String saveUpdate(@ModelAttribute Product product) {
		// add validation
		
		// send student object to DAO via SERVICE
		System.out.println(product.getName() + " : " + product.getId());
		this.productService.updateStudent(product);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	
	
}











