public class Happiness{
  interface Smiler{
    public void smile();
  }

  public static void main(String[] args){
    class Happy implements Smiler{
      private String more = "";
      public void smile(){
	System.out.println(":-)" + more);
      }
      public void happier(){
	more += ")";
      }
    }
    Happy h1=new Happy();
    h1.smile();
    Happy h2 =new Happy();
    h2.happier();
    h2.smile();
  }
}


