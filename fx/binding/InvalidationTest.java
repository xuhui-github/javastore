package binding;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class InvalidationTest{
  public static void main(String[] args){
	IntegerProperty counter=new SimpleIntegerProperty(100);
	counter.addListener(InvalidationTest::invalidated);

	System.out.println("Before chaning the counter value-1");
	counter.set(101);
	System.out.println("After changing the counter value-1");

	System.out.println("\nBefore chaning the counter value-2");
	counter.set(102);
	System.out.println("After changing the counter value-2");

	int value=counter.get();
	System.out.println("Counter value = " + value);

	System.out.println("\nBefore changing the coutner value-3");
	counter.set(102);
	System.out.println("After changing the counter value-3");
	
	System.out.println("\nBefore changing the counter value-4");
	counter.set(104);
	System.out.println("After changing the counter value-4");
  }

  public static void invalidated(Observable prop){
	System.out.println("Counter is invalid.");
  }
}


