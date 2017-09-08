package com.home.java.prac;

import com.home.java.beans.EmployeeDetails;

public class EmpBusinessLogic {

	
	public  Double calculateYearlySal(EmployeeDetails employeeDetails) {
		
		return employeeDetails.getMonthlySal()*12;
	}
	
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
	      double appraisal = 0;
			
	      if(employeeDetails.getMonthlySal() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
}
