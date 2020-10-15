package com.noman.collection.queue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {

	BlockingQueue< String> queue;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
				String msg;
			Thread.sleep(5000);
			while(!(msg=queue.take()).equals("STOP"))
			{
				System.out.println(msg+" interview complete");
				
				Thread.sleep(5000);
				
			}
			
			System.out.println("All candidates are interviewed..");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public InterviewProcessor(BlockingQueue<String> queue) {
		// TODO Auto-generated constructor stub
		
		this.queue = queue;
	}
	
	

}
