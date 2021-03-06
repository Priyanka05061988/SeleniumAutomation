package com.csg.tau.TestProject.SeleniumJan;

import org.testng.annotations.Test;


public class multiplemethods {
	@Test(priority=1)
	public void paras() {
		System.out.println(" Paras is executing");
	}
	@Test(priority=0)
	public void priyanka() {
		System.out.println(" priyanka is executing");
	}
	
	@Test(priority=2)
	public void ajay() {
		System.out.println(" ajay is executing");
	}
	
	@Test()
	public void vanadana() {
		System.out.println(" vandana is executing");
	}
}
