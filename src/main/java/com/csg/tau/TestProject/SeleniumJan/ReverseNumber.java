package com.csg.tau.TestProject.SeleniumJan;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3668906;
		int rev = 0;
		
		while(n>0)
		{
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		
		System.out.println(rev);
		
	}

}
