package com.csg.tau.TestProject.SeleniumJan;

import org.testng.annotations.Test;


	
	public class dependsonTEstNG {
		@Test(groups="login")
		public void paras() {
			System.out.println(" Paras is executing");
		}
		@Test(groups="login")
		public void priyanka() {
			System.out.println(" priyanka is executing");
		}
		
		@Test(dependsOnGroups="login")
		public void ajay() {
			System.out.println(" ajay is executing");
		}
		
		@Test(priority=0)
		public void vanadana() {
			System.out.println(" vandana is executing");
		}
	}

