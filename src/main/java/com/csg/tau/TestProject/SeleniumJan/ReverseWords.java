package com.csg.tau.TestProject.SeleniumJan;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am learning java";
		String[] y= str.split(" ");
		
		for(int i=y.length-1;i>=0;i--)
		{
			System.out.print(y[i]+" ");
		}
	}

}
