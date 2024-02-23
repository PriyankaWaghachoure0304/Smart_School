package com.smart_school.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smart_school.Repository.StaffDetailsRepository;
import com.smart_school.entity.StaffDetails;


@Service
public class StaffDetailsService {
	 private final StaffDetailsRepository staffDetailsRepository;

	    
	    public StaffDetailsService(StaffDetailsRepository staffDetailsRepository) {
	        this.staffDetailsRepository = staffDetailsRepository;
	    }

	    
	    public StaffDetails save(StaffDetails staffDetails) {
	        return staffDetailsRepository.save(staffDetails);
	    }

	    
	    public List<StaffDetails> getAllStaffDetails() {
	        return staffDetailsRepository.findAll();
	    }

	    
	    public StaffDetails getStaffDetailsById(Long id) {
	        return staffDetailsRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Staff details not found with ID: " + id));
	    }

	   
	   
	    public String deleteStaffDetails(Long id) {
	        staffDetailsRepository.deleteById(id);
	        return "details removed!!"+id;
	    }

	    public StaffDetails updateStaffDetails(StaffDetails staffdetails)
	    {
	    	StaffDetails existingStaffDetails=staffDetailsRepository.findById(staffdetails.getId()).orElse(null);
	    	existingStaffDetails.setAadharNo(staffdetails.getAadharNo());
	    	existingStaffDetails.setEmailid(staffdetails.getEmailid());
	    	existingStaffDetails.setPanno(staffdetails.getPanno());
	    	return staffDetailsRepository.save(existingStaffDetails);
	    }
}
