package com.smart_school.controller;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smart_school.entity.StaffDetails;
import com.smart_school.service.StaffDetailsService;

@RestController
public class UserController {

	@Autowired
	 private  StaffDetailsService staffDetailsService;
	 
	 public UserController(StaffDetailsService staffDetailsService) {
	        this.staffDetailsService = staffDetailsService;
	    }
	 
	    @PostMapping("/save-details")
	    public StaffDetails submitStaffDetailsForm(@RequestBody StaffDetails staffDetails) {
	        return staffDetailsService.save(staffDetails); 
	    }
	    @GetMapping("/staff-details/{id}")
	    public StaffDetails findDetails(@PathVariable Long  id)
	    {
	    	return staffDetailsService.getStaffDetailsById(id);
	    }
	    
	    @PutMapping("/update")
	    public StaffDetails updateStaffDetails(@RequestBody StaffDetails staffDetails)
	    {
	    	return staffDetailsService.updateStaffDetails(staffDetails);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public String deleteStaffDetails(@PathVariable Long id)
	    {
	    	return staffDetailsService.deleteStaffDetails(id);
	    }
}
