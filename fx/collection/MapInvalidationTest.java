package collection;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class MapInvalidationTest{
  public static void main(String[] args){
	ObservableMap<String,Integer> map=FXCollections.observableHashMap();
	map.addListener(MapInvalidationTest::invalidated);
	System.out.println("Before adding (\"one\",1)");
	map.put("one",1);
	System.out.prinn("After adding (\"one\",1)");
	System.out.println("\nBefore adding (\"two\",2)");
	map.put("two",2);
	System.out.println("After adding (\"two\",2)");
     
	map.addListener( (Observable observable) -> {
	  System.out.println("Invaliding map");});

	map.addListener( new javafx.beans.InvalidationListener(){
	  public void invalidated(Observable observable){
		System.out.println("匿名更新监听器");
	  }});
	System.out.println("\nBefore adding (\"one\",1)");
	map.put("one",1);
	System.out.println("After adding (\"one\",1)");
	System.out.println("\nBefore adding (\"one\",100)");
	map.put("one",100);
	System.out.println("After add (\"one\",100)");
	System.out.println("\nBefore calling clear()");
	map.clear();
	System.out.println("After calling clear()");
	System.out.println("end...");

  }

  public static void invalidated(Observable map){
	System.out.println("Map is invalid.");
  }
}



