package com.csg.tau.TestProject.SeleniumJan;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
//		String[] cars = {"BMW","Honda","maruti"};
//		
//		for(String car : cars) {
//			System.out.println(car);
//		}
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(i);
//		}
//		
//		for(int i=0;i<5;i++)
//			
//		{
//			System.out.println(i);
//			
//		
		Scanner s = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter a number between 0 and 10 : ");
			n = s.nextInt();
		}while (n<1 || n>10);
		System.out.println(n+ " is between 0 and 10.");
	}
	

}
