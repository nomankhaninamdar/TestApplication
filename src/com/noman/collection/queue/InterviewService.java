package com.noman.collection.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class InterviewService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  BlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
  
  InterviewScheduler scheduler = new InterviewScheduler(queue);
  
  InterviewProcessor processor = new InterviewProcessor(queue);
  
 // Thread schedulerThread= new Thread(scheduler);
  
  new Thread(scheduler).start();
  
 // Thread processorThread = new Thread(processor);
  
  new Thread(processor).start();
  
	}

}
