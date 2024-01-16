package binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BidirectionalBinding{
  public static void main(String[] args){
	IntegerProperty x= new SimpleIntegerProperty(1);
	IntegerProperty y= new SimpleIntegerProperty(2);
	IntegerProperty z= new SimpleIntegerProperty(3);

	System.out.println("Before binding");
	System.out.println("x=" + x.get() +",y=" + y.get() +",z=" +z.get());
	
	x.bindBidirectional(y);
	System.out.println("x.bindBidirectional(y)");
	System.out.println("x=" +x.get() + ",y=" + y.get() + ",z=" +z.get());


	x.bindBidirectional(z);
	System.out.println("x.bindBidirectional(z)");
	System.out.println("x= " + x.get() + ",y=" + y.get() + ",z=" + z.get());
    
	x.set(19);
	System.out.println("After changing z");
	System.out.println("z.set(19)");
	System.out.println("x=" + x.get() + ",y=" + y.get() + ",z=" + z.get());

	x.unbindBidirectional(y);
	x.unbindBidirectional(z);

    
	System.out.println("just unbinding x.unbindBidirectional(y) x.unbindBidirectional(z) ");
	System.out.println("x=" + x.get() + ",y=" + y.get() + ",z=" + z.get());
	System.out.println("After unbinding and changing them separately:");
	x.set(100);
	y.set(200);
	z.set(300);
	System.out.println("x=" + x.get() + ",y=" + y.get() + ",z=" + z.get());
  }
}




