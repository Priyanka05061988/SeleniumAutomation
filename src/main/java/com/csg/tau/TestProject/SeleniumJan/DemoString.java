package com.csg.tau.TestProject.SeleniumJan;

public class DemoString {
	
	public static void main(String[] args)
	{
		String str="    Priyanka";
		String str1="PRIYANKA";
	
		//str+"kumar";
		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.substring(0,2));
		System.out.println(str.contains("ay"));
		System.out.println(str.equals("Priyanka"));
		System.out.println(!str.isEmpty());
		System.out.println(str.replace('a', 'n'));
		System.out.println(str.replace("Pri", "Bri"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
		System.out.println(str.concat("kumar"));
	}

}
