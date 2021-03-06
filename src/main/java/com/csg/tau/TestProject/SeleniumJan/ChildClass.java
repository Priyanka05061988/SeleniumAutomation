package com.csg.tau.TestProject.SeleniumJan;

public class ChildClass extends ParentClass {

	int a =20;
	ChildClass(){
		super();
		System.out.println("Child class is running");
		
	}
	void print() {
		System.out.println("value of a is " +super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
obj.print();

	}

}
