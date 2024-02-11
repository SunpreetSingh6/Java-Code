/*
class Hi implements Runnable
{
	public void run()
	{	
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("Hi");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
		
}
class Hello implements Runnable 
{
	public void run()
	{	
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("Hello");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}
	}
}
*/
public class MultiThreadingDemo 
{

	public static void main(String[] args) throws Exception
	{
		/* Multithreading in Java is a process of executing multiple threads simultaneously. 
		 * A thread is a lightweight sub-process, the smallest unit of processing. 
		 * Multiprocessing and multithreading, both are used to achieve multitasking.
		 * However, we use multithreading than multiprocessing because threads use a shared memory area,
		 * and switching between the threads takes less time than process. Threads are independent.
		 * 
		 * To achieve threading we can extend Thread class or if a class is already extended by a class 
		 * then we can implement a runnable interface
		 * One thread is already running in our main() function to create another one 
		 * we need to create object of the thread class and need to create a run() method in class .
		 * To call that run method we need to use start() method which will create a new thread.  
		 * 
		 * Advantages of MultiThreading.
		 * 1)You can perform multiple operations together at a time.
		 * 2)Threads are independent, it doesn't affect other threads if an exception occur in a single thread.
		 * 
		 * Java Multithreading is mostly used in games, animation, etc.
		 * 
		 * */
		
		
	/*	Hi obj1 = new Hi();
		Hello obj2 = new Hello(); 
		//obj1.start();       // this is if we are extending Thread class
		//obj2.start();		 // this is if we are extending Thread class
		
		//Now if we are using Runnable interface, we need to create object of Thread class.
		Thread t1 = new Thread(obj1);	// we need to pass the object of class because runnable interface don't have 
		Thread t2 = new Thread(obj2);	// any method start.so we need to create object of Thread class first
		t1.start();
		t2.start();
	*/	
		
		// Now we can also create the object of runnable interface(can't make object of an interface) by using anonymous class.
		// because we are using both the classes for only once.
		
		Runnable obj1 = () ->			// lambda expression
					{	
						for(int i=0 ; i<5 ; i++)
						{
							System.out.println("Hi");
							try { Thread.sleep(1000); } catch (InterruptedException e) {}
						}
					};
		Runnable obj2 =() ->			// lambda expression
					{	
						for(int i=0 ; i<5 ; i++)
						{
							System.out.println("Hello");
							try { Thread.sleep(1000); } catch (InterruptedException e) {}
						}
					};
		Thread t1 = new Thread(obj1);		
		Thread t2 = new Thread(obj2);
		
		// we can also set name to the threads.
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("Thread :- Hi");
		t2.setName("Thread :- Hello");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		// we can also set priority to the threads. Thread priority Range (1-10) 1- minimum , 10-maximum , 5 -normal
		//t1.setPriority(1);
		//t1.setPriority(10);
		// or we can also do this
		t1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY is a static variable thats why we are using class name
		t2.setPriority(Thread.MIN_PRIORITY); //// MIN_PRIORITY is a static variable thats why we are using class name
		
		t1.start();
		t2.start();
		/* Here we can also pass the lambda expression in place of object i.e. from ()-> to };
		 * Thread t1 = new Thread(() ->			
					{	
						for(int i=0 ; i<5 ; i++)
						{
							System.out.println("Hi");
							try { Thread.sleep(1000); } catch (InterruptedException e) {}
						}
					}   );
					
					*/
		
		
		
		System.out.println(t1.isAlive()); // TRUE  isAlive() is used to detect whether our thread is in running state or not.
		t1.join();  // if we are running the code without this we are getting "bye" in between our 'Hi' and 'Hello'   
		t2.join();//because our main's thread is free that time so to execute our "bye" at last we need to use join() method
		System.out.println(t1.isAlive()); // FALSE
		System.out.println(t2.isAlive()); // FALSE
		System.out.println("Bye");//which means when our t1,t2 reaches the join and destroyed then our main thread can continue.
	
	}

}
