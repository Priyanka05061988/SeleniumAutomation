package com.csg.tau.TestProject.SeleniumJan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
		hm.put(1,"Paras");
		hm.put(3,"Pranav");
		hm.put(6,"Aditi");
		hm.put(8,"Priyanka");
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		TreeMap<Integer,String> hm2=new TreeMap<Integer,String>();
		hm2.put(7,"Ajay");
		hm2.put(3,"Piyush");
		hm2.put(9,"Jayesh");
		
		hm.putAll(hm2);
		hm.putIfAbsent(10, "Jayesh");
		hm.put(2, "John");
		
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(6));
		System.out.println(hm.containsValue("Piyush"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(7));
		System.out.println(hm.entrySet());
		
		for(Map.Entry x: hm.entrySet()) {
			//System.out.println(x.getKey()+" "+x.getValue());
			
			
		}
		Set s=hm.entrySet();
		Iterator ite=s.iterator();
		while(ite.hasNext()){
		Map.Entry x=(Map.Entry)ite.next();
		System.out.println(x.getKey() +" "+ x.getValue());
	}

}
}