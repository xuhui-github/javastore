package collection;
import java.util.List;
import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.util.Callback;

public class ListUpdateTest{
  public static void main(String[] args){
	Callback<IntegerProperty,Observable[]> extractor = (IntegerProperty p) -> {
	  System.out.println("The extractor is called for " + p);
      return new Observable[] {p};
	};

	ObservableList<IntegerProperty> list = FXCollections.observableArrayList(extractor);
	System.out.println("Before adding two elements...");
	
	IntegerProperty p1=new SimpleIntegerProperty(10);
	IntegerProperty p2=new SimpleIntegerProperty(20);
	list.addAll(p1,p2);
	System.out.println("After adding two elements...");
	list.addListener(ListUpdateTest::onChanged);
	//Update p1 form 10 to 100,which will trigger 
	//an update change for the list
	p1.set(100);
  }

  public static void onChanged(ListChangeListener.Change<? extends IntegerProperty> change){
	while(change.next()){
	  if(change.wasUpdated()){
		System.out.println("An update is detected.");

		int start=change.getFrom();
		int end=change.getTo();
		System.out.println("Update range: [" + start + ", " + end + "]");
		List<? extends IntegerProperty> updatedElements;
		updatedElements=change.getList().subList(start,end);
		System.out.println("Updated elements:" + updatedElements);
	  }
	}
  }
}

