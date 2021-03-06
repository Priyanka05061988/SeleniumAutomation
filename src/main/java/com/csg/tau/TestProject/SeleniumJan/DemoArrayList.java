package com.csg.tau.TestProject.SeleniumJan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;



public class DemoArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<Integer>();

		a.add(10);
		a.add(40);
		a.add(20);
		a.add(30);
		//a.clear();
		//a.remove(1);
		//a.removeAll(a);
		
		LinkedList<Integer> b=new LinkedList<Integer>();
		b.add(15);
		b.add(20);
		b.add(45);
		a.addAll(b);
		//a.retainAll(b);
		Collections.sort(a);
	
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.contains(45));
		for(Integer x:a) {
			System.out.println(x);
			
			Iterator<Integer> ite=a.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
				
			}
		}

	}
}
