package com.multithreading;

public class ThreadName implements Runnable{
	@Override
	public void run() {
		for(int i=1 ; i<=10; i++){
			System.out.println("from run method : "+i + "  "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
        
         ThreadName tn = new ThreadName();
         
         Thread thread=new Thread(tn);
         thread.setName("Thread1");
         thread.setPriority(10);
         thread.start();
         
         Thread th = new Thread(tn);
         th.setName("Thread2");
        // thread.setPriority(MIN_PRIORITY);;
         th.start();
         
         for(int i = 1; i<=10 ; i++){
        	 System.out.println("from main thread : "+i +" " +Thread.currentThread().getName());
         }
	}
}
