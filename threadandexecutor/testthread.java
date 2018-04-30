package threadandexecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class uplaodresults implements Runnable{

	public String taskname;
	
	public uplaodresults(String taskname) {
		super();
		this.taskname = taskname;
	}

	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+"start" +taskname);
	
	try {
		Thread.sleep(2000);
	}catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
	System.out.println(Thread.currentThread().getName()+"end"+taskname);
		// TODO: handle exception
	}
		


}


public class testthread{
	
	public static void main(String[] args) {
	
		
	//using thread class
		
		//Thread t1=new Thread(ur);
	//	t1.start();
	
	//using executor classes:
	//	ExecutorService es=Executors.newsingleThread();
		
		//thread pool example
		ExecutorService es=Executors.newFixedThreadPool(2);
		int nooftasks=3;
		for (int i = 1; i <= nooftasks; i++) {
			uplaodresults ur=new uplaodresults("taskname"+i);
			es.execute(ur);
			
			
		}
		
		es.shutdown();
		
		while (!es.isTerminated()) {
		
			
		}
		System.out.println("threadsended");
	
	}
}