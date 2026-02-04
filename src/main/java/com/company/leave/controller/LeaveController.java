package com.company.leave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.LeaveDaysCalc;

@Controller
public class LeaveController {
	//http://localhost:8080/SpringMVC/applyLeave

	@RequestMapping("/applyleave") //Maps URL to Method
	public String showForm() {
		return "apply-leave"; //returns view name
	}
	
	@PostMapping("/submitLeave") //Maps URL to Method
	public String submitLeave( //Maps Request Parameters to Method Parameters
	        @RequestParam("employeeName") String employeeName,
	     //   @RequestParam("days") int days,
	        @RequestParam("reason") String reason,
	    	//	@RequestParam String leaveType,
	    		@RequestParam String startDate,
	    		@RequestParam String endDate,
	        Model model) {
		
		
		LeaveDaysCalc leaveDaysCalc = new LeaveDaysCalc();
		int days = leaveDaysCalc.calculateLeaveDays(startDate, endDate);
	    model.addAttribute("employeeName", employeeName); //Adds attributes to the Model to pass further to jsp
	    model.addAttribute("days", days);
		/*
		 * model.addAttribute("startDate", startDate); 
		 * model.addAttribute("endDate",endDate);
		 */
	    model.addAttribute("reason", reason);
	    model.addAttribute("status", "Pending Manager Approval");

	    return "leave-summary"; //returns view name
	}
	

}
