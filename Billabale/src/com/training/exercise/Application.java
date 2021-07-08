package com.training.exercise;

import com.training.department.Advocate;
import com.training.department.CivilEnginner;
import com.training.department.SoftwareEnginner;
import com.training.exercise.Billable.service;

public class Application {

	public static void main(String[] args) {
    
		service service=new service();
		SoftwareEnginner se = new SoftwareEnginner();
		CivilEnginner ce = new CivilEnginner();
		Advocate ad = new Advocate();
		
		service.getSalary(se);
		service.getSalary(ce);
		service.getSalary(ad);
		

	}

}
