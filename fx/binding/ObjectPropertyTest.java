package binding;

import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class ObjectPropertyTest{
  public static void main(String[] args){
  Book b1 = new Book("J1",90,"1234567890");
  Book b2 = new Book("J2",80,"0123456789");

  ObjectProperty<Book> book1=new SimpleObjectProperty<>(b1);
  ObjectProperty<Book> book2=new SimpleObjectProperty<>(b2);

  BooleanBinding isEqual = book1.isEqualTo(book2);
  System.out.println(isEqual.get());

  book2.set(b1);
  System.out.println(isEqual.get());
  }

}

