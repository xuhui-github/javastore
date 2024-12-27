package collection;

import java.io.InputStream;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;


public class ListInvalidationTest{
  public static void invalidated(Observable list){
	System.out.println("list is invalid");
  }
  public static void main(String[] args){
  ObservableList<String> list=FXCollections.observableArrayList("one","two");
  
  list.addListener( new InvalidationListener(){
	public void invalidated(Observable list){
	  System.out.println("List is invalid");
	}});
//    list.addListener( ( olist ) ->
//     {System.out.println("List is invalid");
//    });


  list.addListener(new ListChangeListener<String>(){
	@Override
	public void onChanged(ListChangeListener.Change<? extends String> change){
	  System.out.println("List has changed");
	}
  });


  System.out.println("Before add three");
  list.add("three");
  System.out.println("After adding three");

  System.out.println("Before adding four and five");
  list.addAll("four","five");
  System.out.println("After adding four and five");

  System.out.println("Before replacing one with one.");
  list.set(0,"one");
  System.out.println("After replacing one with one.");
}
}




