
public class ThreadInterfaceEx implements Runnable{
	@Override
	public void run(){
		for(int x=0;x<10;x++)
		{
			try{
				Thread.sleep(1000);
				System.out.println(x);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args){
		ThreadInterfaceEx ex=new ThreadInterfaceEx();
		Thread th=new Thread(ex);
		th.start();
		
	}

}
