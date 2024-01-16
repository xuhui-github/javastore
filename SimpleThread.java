public class SimpleThread{
  public static void main(String[] args){
    Thread t=new Thread(new Runnable(){
      public void run(){
	System.out.println("Hello world");
      }
    });
    t.start();
  }
}

