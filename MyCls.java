
public class MyCls extends Thread {
	
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		MyCls m=new MyCls();
		m.start();
		System.out.println("Its of main");
		m.stop();
		m=new MyCls();
		m.start();
	}

}
