package binding;

import javafx.beans.property.StringProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Book{
  private StringProperty title =new SimpleStringProperty(this,"title","Unknown");
  private ReadOnlyStringWrapper ISBN = new ReadOnlyStringWrapper(this,"ISBN","Unknown");
  private DoubleProperty price = new SimpleDoubleProperty(this,"price",0.0);


  public Book(){
  }
  public Book(String title,double price,String ISBN){
	this.title.set(title);
	this.price.set(price);
	this.ISBN.set(ISBN);
  }


  public final StringProperty titleProperty(){
	return title;
  }

  public final String getTitle(){
	return title.get();
  }

  public final void setTitle(String title){
	this.title.set(title);
  }

  public final String getISBN(){
	return ISBN.get();
  }

  public final ReadOnlyStringProperty ISBNProperty(){
	return ISBN.getReadOnlyProperty();
  }

  public final double getPrice(){
	return price.get();
  }

  public final void setPrice(double price){
	this.price.set(price);
  }

  public final DoubleProperty priceProperty(){
	return price;
  }



}

