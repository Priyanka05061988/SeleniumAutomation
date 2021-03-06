package com.csg.tau.TestProject.SeleniumJan;

import org.testng.annotations.Test;

public class multipleMethods {

	@Test
	public void paras(){
		System.out.println("Paras is executing");
	}

	@Test
	public void pranav(){
		System.out.println("pranav is executing");
	}

	@Test(dependsOnMethods={"paras","pranav"})
	public void aditya(){
		System.out.println("aditya is executing");
	}

	@Test
	public void komal(){
		System.out.println("komal is executing");
	}

	@Test
	public void brett(){
		System.out.println("brett is executing");
	}
}
