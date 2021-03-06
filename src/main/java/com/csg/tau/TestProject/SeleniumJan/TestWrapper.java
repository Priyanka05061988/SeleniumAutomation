package com.csg.tau.TestProject.SeleniumJan;

public class TestWrapper {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		int a=10;
		Integer b = Integer.valueOf(a);    //Autoboxing
		System.out.println(b);
		Integer c=a;
		System.out.println(c);
		
		@SuppressWarnings("deprecation")
		Integer x= new Integer(10);        //unboxing
		int y=x.intValue();
		System.out.println(b);
		int z=x;
		System.out.println(c);
		
	}

}
