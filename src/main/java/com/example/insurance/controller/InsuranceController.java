package com.example.insurance.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.insurance.java.Insurance;
import com.example.insurance.repo.InsuranceRepo;

@RestController
public class InsuranceController {
	@Autowired
	InsuranceRepo insrepo;
	
	@GetMapping(path="/getinsurancedetails")
	public List<Insurance> getinsurancedetails(){
		List<Insurance> insLst = insrepo.findAll();
		return insLst;
	}
	
	@PostMapping(path="/insertCustDetails")
	public List<Insurance> insertCustDetails(@RequestBody List<Insurance> insert ){
		insrepo.saveAll(insert);
		return insert;
	}
	
	@DeleteMapping(path="/delCustDetails/{policyId}")
		public String delCustDetails(@PathVariable int policyId){
			insrepo.deleteById(policyId);
			return "Deleted Successfully";
		}
}
