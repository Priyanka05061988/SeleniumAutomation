package com.csg.tau.TestProject.SeleniumJan;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am learning Java Programming";
		String[] target= str.split(" ");
		
		for(int i=0;i<target.length;i++)
		{
			System.out.println(target[i]);
			
		}
		
		
		
	}

}
