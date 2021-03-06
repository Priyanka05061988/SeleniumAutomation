package selenium.myproject;

import java.util.Scanner;

public class NewPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TestMethod();
	NewPractice.TestMethod();
	String s1="Learning JAVA";
	String s3="Selenium";
	System.out.println(s1.toUpperCase());
	
	String s2=s1.toLowerCase();
	System.out.println(s2);
	
	int i=s1.length();
	System.out.println(i);
	
	char c=s1.charAt(12);
	System.out.println(c);
	
	System.out.println(s1.indexOf('k'));
	System.out.println(s1.contains(s2));
	System.out.println(s1.concat(" "+s3));
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your name and age: ");
	String name=input.next();
	int age=input.nextInt();
	System.out.println(name +"Your age is:" + age);

	}

	public static void TestMethod(){

		System.out.println("Hi from  Priyanka");
		
	}
}
