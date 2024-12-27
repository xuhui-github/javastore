package binding;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
public class ChangeAndInvalidationTest{
  public static void main(String[] args){
	IntegerProperty counter= new SimpleIntegerProperty(100);

	counter.addListener( (Observable prop) -> {
	  System.out.println("Counter is invalid.");
	});

	counter.addListener( new ChangeListener<Number>() {
	  public void changed(ObservableValue<? extends Number> prop,
		                  Number oldValue,
						  Number newValue){
		System.out.print("Counter changed:");
		System.out.println("old=" + oldValue + ", new=" + newValue);
	  }});

	System.out.println("Before changing the counter value-1");
	counter.set(101);
	System.out.println("After changing the counter value-1");

	System.out.println("\nBefore changing the counter value-2");
	counter.set(102);
	System.out.println("After changing the counter value-2");

	System.out.println("\nBefore changing the counter value-3");
	counter.set(102);
	System.out.println("After changing the counter value-3");

	System.out.println("\nBefore changing the counter value-4");
	counter.set(103);
	System.out.println("After changing the counter value-4");
	}
  }

