package com.learning;

public class TestingThread {

	public static void main(String[] args) {
		Worker obj = new Worker();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();

	}

}

class Worker implements Runnable{
	
	String lockObj = "Object one";

	@Override
	public void run() {
		synchronized(lockObj) {
			System.out.println("Thread" +Thread.currentThread().getName() + "entered the block");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
