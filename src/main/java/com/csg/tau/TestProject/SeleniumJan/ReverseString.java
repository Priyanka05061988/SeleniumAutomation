package com.csg.tau.TestProject.SeleniumJan;

public class ReverseString {
	

	public static void main(String[] args) {

		String str="Reverse String";
		String[] x= str.split("");
		
		for (int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]);
		}
		
		
}
}