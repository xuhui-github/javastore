package binding;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.application.Application;
import javafx.stage.Stage;
public class JavaFXProperty extends Application{
  public static void main(String[] args){
	Application.launch(args);
  }

  public void start(Stage stage){
	IntegerProperty counter=new SimpleIntegerProperty(1);
	int counterValue=counter.get();
	System.out.println("counter:" + counterValue);

	counter.set(2);
	counterValue=counter.get();
	System.out.println("Counter:" + counterValue);
	
	ReadOnlyIntegerWrapper idWrapper =new ReadOnlyIntegerWrapper(100);
	ReadOnlyIntegerProperty id =idWrapper.getReadOnlyProperty();
	System.out.println("idWrapper:" + idWrapper.get());
	System.out.println("id:"+id.get());

	idWrapper.set(101);
	System.out.println("idWrapper:" + idWrapper.get());
	System.out.println("id:"+id.get());

  }
}

	
  
