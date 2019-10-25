package com.cruds.crmmvc.controller;

import java.util.List;
import javax.validation.Valid;

import org.jboss.logging.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cruds.crmmvc.model.Customer;
import com.cruds.crmmvc.model.Feedback;
import com.cruds.crmmvc.model.Points;
import com.cruds.crmmvc.services.CrmService;
import com.google.gson.Gson;


@Controller
@RequestMapping("/")
public class AppController {
	
	@Autowired
	CrmService crmservice;
	
	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.POST)
	public String LoginPagePost(@RequestParam("username") String username,@RequestParam("password") String password, ModelMap model) {
		if(username == null || password == null || username.trim().length() == 0 || password.trim().length() == 0) 
		{
						return "index";
		}
		else
		{
			model.addAttribute("ERROR", "Invalid Credentials");
			return "home";
		}
		
	}
	
	@RequestMapping(value = { "/index"}, method = RequestMethod.GET)
	public String getLoginPage() {
		System.out.println("Index Page");
		return "index";
	}
	
	@RequestMapping(value = { "/newcustomer"}, method = RequestMethod.GET)
	public String getCustomerPage(ModelMap model) {
		
		Customer customer= new Customer();
		model.addAttribute("newcustomer",customer);
		System.out.println("New Customer Details");
		return "newcustomer";
		
	}
	
	@RequestMapping(value = { "/newcustomer"}, method = RequestMethod.POST)
	public String saveCustomerPage(@Valid Customer customer1, BindingResult rs, ModelMap model) {
		
		Customer c= new Customer();
		Points p = new Points();
		
		p.setTpoint(20);
		crmservice.addCustomer(customer1);
		crmservice.addPoints(p);
		Customer customer= new Customer();
		model.addAttribute("newcustomer",customer);
		System.out.println(customer1);
		System.out.println(" New Customer Added");
		return "newcustomer";
		
	}
	
	@RequestMapping(value = { "/customerfeedback"}, method = RequestMethod.GET)
	public String getFeedbackPage(ModelMap model) {
		
		Feedback feedback = new Feedback();
		model.addAttribute("customerfeedback", feedback);
		
		System.out.println("Customer Feedback");
		return "customerfeedback";
	}
	
	@RequestMapping(value = { "/customerfeedback"}, method = RequestMethod.POST)
	public String saveFeedbackPage(@Valid Feedback feedback1, BindingResult rs , ModelMap model) {
		
		crmservice.addFeedback(feedback1);
		Feedback feedback = new Feedback();
		model.addAttribute("customerfeedback", feedback);
		
		System.out.println("Customer Feedback Added");
		return "customerfeedback";
	}
	
	

	@RequestMapping(value = { "/searchcustomer"}, method = RequestMethod.GET)
	public String getsearchPage() {
		System.out.println("Search page ");
		return "searchcustomer";
	}

	@RequestMapping(value = { "/searchcustomer"}, method = RequestMethod.POST)
	public String postsearchPage(@RequestParam("mobile") long mobile, ModelMap model ) {
		System.out.println("Search page seached ");
		System.out.println("Search " + mobile);
		Customer customer = crmservice.findCustomer(mobile);
		if(customer==null){
			model.addAttribute("view1", true);
		}else{
		System.out.println("Customer details : " + customer);
		model.addAttribute("customer", customer);
		model.addAttribute("view", true);
		
		}
		return "searchcustomer";
	}
	
	@RequestMapping(value = {"/edit-{mobile}-customer"}, method = RequestMethod.GET)
	public String editCustomer(@PathVariable long mobile, ModelMap model){
		System.out.println("Edit page ");
		Customer customer = crmservice.findCustomer(mobile);
		model.addAttribute("newcustomer", customer);
		model.addAttribute("edit", true);
		return "newcustomer";
	}
	
	@RequestMapping(value = {"/edit-{mobile}-customer"}, method = RequestMethod.POST)
	public String updateCustomer(@Valid Customer customer1, BindingResult rs, ModelMap model){
		System.out.println("update page ");
		crmservice.updateCustomer(customer1);
		Customer customer= new Customer();
		model.addAttribute("newcustomer",customer);
		return "newcustomer";
	}
	
	@RequestMapping(value = { "/customerdetails"}, method = RequestMethod.GET)
	public String getnewcustomerPage() {
		System.out.println(" Customer details");
		return "customerdetails";
	}
	
	
}