package com.csg.tau.TestProject.SeleniumJan;

public class DemoThread extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(i);
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DemoThread t1=new DemoThread();
      DemoThread t2=new DemoThread();
      DemoThread t3=new DemoThread();
      t1.start();
      try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      t2.start();
      t3.start();
      System.out.println(t1.getName());
      System.out.println(t2.getName());
      System.out.println(t3.getName());
      System.out.println(t1.getId());
      System.out.println(t2.getId());
      System.out.println(t3.getId());
      t1.setName("Priyanka");
      System.out.println(t1.getName());
	}

}
