package com.multithreading;

public class ThreadLifeCycle extends Thread{
	
	@Override
	public void run() {
	    System.out.println("==========from run method============ ");	
	    System.out.println("is alive ? : "+this.isAlive());
		System.out.println("thread id : "+this.getId());
		System.out.println("thread state : "+this.getState());
	}
   
	public static void main(String[] args) {
		ThreadLifeCycle tlc = new ThreadLifeCycle();
		
		Thread th1 = new Thread(tlc);
		th1.setName("Thread1");
		th1.setPriority(1);
		
		System.out.println("===========before start() method.==============");
		System.out.println("is alive ? : "+th1.isAlive());
		System.out.println("thread id : "+th1.getId());
		System.out.println("thread state : "+th1.getState());
		
		th1.start();
		
		System.out.println("=============after start() method.=================");
		System.out.println("is alive ? : "+th1.isAlive());
		System.out.println("thread id : "+th1.getId());
		System.out.println("thread state : "+th1.getState());
	}
}
