package com.csg.tau.TestProject.SeleniumJan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(45);
		hs.add(10);

		System.out.println(hs);

		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(45);
		lhs.add(10);

		System.out.println(lhs);
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(30);
		ts.add(20);
		ts.add(45);
		ts.add(15);
		
		System.out.println(ts);
		
		
	}
	
}