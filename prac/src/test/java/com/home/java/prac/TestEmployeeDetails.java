package com.home.java.prac;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.home.java.beans.EmployeeDetails;

public class TestEmployeeDetails {

	static EmployeeDetails emp = null;
	
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	
	@BeforeClass
	public static void createEmployeeDetails() {
		emp= new EmployeeDetails();
		emp.setName("Sudhir");
		emp.setMonthlySal(10000.00);
		emp.setAge(33);
		//return emp;
	}
	
	@Test
	public void testEmployeeDetails() {
		Assert.assertNotNull(emp);
		Assert.assertNotNull(emp.getName());
		Assert.assertNotNull(emp.getMonthlySal());
		Assert.assertNotNull(emp.getAge());
	}
	
	
	@Test
	public void testCalculateAppraisal() {
		Double salary = empBusinessLogic.calculateAppraisal(emp);
		Assert.assertEquals(1000.00, salary.doubleValue(),0.0);
	}
	
	@Test
	public void testCalculateYearlySal() {
		double monthlySal= empBusinessLogic.calculateYearlySal(emp);
		Assert.assertEquals(emp.getMonthlySal()*12, monthlySal,0.0);
	}
}
