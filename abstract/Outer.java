public class Outer{
  private String greeting="Hi";

  private class Inner{
    public int repeat=3;
    public void go(){
      for(int i=0;i<repeat;i++)
	System.out.println(greeting);
    }
  }

  public void callInner(){
    Inner inner=new Inner();
    inner.go();
  }

  public static void main(String[] args){
   /* Outer outer=new Outer();
    outer.callInner();
    Outer1 outer1=new Outer1();
    outer1.callInner();
    Outer.Inner i2=outer1.new Inner();
    i2.go();*/
    Outer outer=new Outer();
    outer.callInner();

    Outer1 outer1=new Outer1();
    outer1.callInner();

  }

}

class Outer1 extends Outer{}
