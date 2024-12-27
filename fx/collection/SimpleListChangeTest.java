package collection;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class SimpleListChangeTest{
  public static void main(String[] args){
	ObservableList list=FXCollections.observableArrayList();
    list.addListener(new ListChangeListener<String>(){
	  public void onChanged(ListChangeListener.Change<? extends String> change){
	//	System.out.println("List has changed");
	    while(change.next()){
	    if(change.wasPermutated()){
		  System.out.println("Permutated");
		  System.out.println("Frome = " + change.getFrom() + ",To=" + change.getTo());
		} else if(change.wasUpdated()){
		  System.out.println("Frome = " + change.getFrom() + ",To=" + change.getTo());
		  System.out.println("Updated");
		  System.out.println("Frome = " + change.getFrom() + ",To=" + change.getTo());
		} else if(change.wasReplaced()){
		  System.out.println("Replaced");
		  System.out.println("Frome = " + change.getFrom() + ",To=" + change.getTo());
		} else if(change.wasAdded()){
		  System.out.println("Added");
		  System.out.println("added elements" + change.getAddedSubList());
		} else if(change.wasRemoved()){
		  System.out.println("Removed");
		  System.out.println("removed elements:" + change.getRemoved());
		}
		}
	}});

	list.add("one");
	list.add("two");
	System.out.println("after adding elements");
	FXCollections.sort(list);
	System.out.println("After sorting elements");
	list.clear();
	list.add("one");
	list.add("two");
	list.set(0,"first");
	list.set(1,"second");
	
}
}

