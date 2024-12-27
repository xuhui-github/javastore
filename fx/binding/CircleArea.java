package binding;


import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CircleArea{
  public static void main(String[] args){
	DoubleProperty radius=new SimpleDoubleProperty(7.0);
	DoubleBinding area=radius.multiply(radius).multiply(Math.PI);
	System.out.println("Radius = " + radius.get() +
		"Area= " + area.get());

	radius.set(14.0);
	System.out.println("Radius = " + radius.get() +
		"Area= " + area.get());

	DoubleProperty area2=new SimpleDoubleProperty();
	area2.bind(radius.multiply(radius).multiply(Math.PI));
	System.out.println("Radius=" + radius.get() +
		"Area= " + area2.get());
  }
}


