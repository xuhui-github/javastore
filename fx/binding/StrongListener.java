package binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class StrongListener{
  public static IntegerProperty counter =new SimpleIntegerProperty(100);
  public static void main(String[] args){
	addStringListener();
	counter.set(300);
  }

  public static void addStringListener(){
	ChangeListener<Number> listener=StrongListener::changed;
	counter.addListener(listener);
	counter.set(200);
  }

  public static void changed(ObservableValue<? extends Number> prop,
	                         Number oldValue,
							 Number newValue){
	System.out.print("Counter changed:");
	System.out.println("Old= " + oldValue + ", new= "+ newValue);
  }
}


