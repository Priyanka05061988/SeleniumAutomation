package com.csg.tau.TestProject.SeleniumJan;

public class ConcreteClass implements InterfacePractice,InterfaceTwo{


	public void minus(){
		int x=10;
		int y=20;
		int z=y-x;
		System.out.println(z);
	}
	public void sum(){
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);

		
	}
	
	public void print() {
		
		System.out.println("concrete class is running");
	}
}
