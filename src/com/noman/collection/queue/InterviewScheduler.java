package com.noman.collection.queue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable
{
	BlockingQueue<String> queue ;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=10;i++)
		{ 
			String msg = new String("Candidate:"+i);
			try {
				queue.put("Candidate:"+i);
				System.out.println("Candidate:"+i+" scheduled for interview");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			String msg = new String("STOP");
			queue.put("STOP");
			System.out.println("All Candidates are scheduled for interview");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public InterviewScheduler(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	

	
}
