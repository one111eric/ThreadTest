
public class ThreadTest implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ThreadTest a=new ThreadTest();
          a.startThread();
          System.out.println(a.getClass());
          if(a instanceof ThreadTest)
          {}
	}
	public void run()
	{
		System.out.println("abc");
	}
	public void startThread()
	{
		Thread a=new Thread(this);
		a.run();
		
	}

}
