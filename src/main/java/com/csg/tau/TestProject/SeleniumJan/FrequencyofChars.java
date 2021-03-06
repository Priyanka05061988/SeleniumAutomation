package com.csg.tau.TestProject.SeleniumJan;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyofChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i am learning java";
		//str=str.toUpperCase();
		
		TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();
		
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
