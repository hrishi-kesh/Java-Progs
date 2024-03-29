class Bathroom implements Runnable
{
	public void run()
   {
   	try
   	{
   		System.out.println(Thread.currentThread().getName()+"has entered bathroom");
   		Thread.sleep(5000);
   		System.out.println(Thread.currentThread().getName()+"has exited bathroom");
   		Thread.sleep(5000);
   	}
   	catch(Exception e)
   	{
   		System.out.println("Interrupt");
   	}
   }
} 
class Thread4
{
	public static void main(String[] args) 
	{
		Bathroom b=new Bathroom();
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);

		t1.setName("boy ");
		t2.setName("girl ");
		t3.setName("others ");
		t1.start();
		t2.start();
		t3.start();
	}
}