package collection;



import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person implements Comparable<Person>{
  private StringProperty firstname=new SimpleStringProperty();
  private StringProperty lastname=new SimpleStringProperty();

  public Person(){
	this.setFirstName("Unknown");
	this.setLastName("Unknown");
  }

  public Person(String firstname,String lastname){
	this.setFirstName(firstname);
	this.setLastName(lastname);
  }

  public final String getFirstName(){
	return firstname.get();
  }
  public final void setFirstName(String newFirstName){
	firstname.set(newFirstName);
  }

  public StringProperty firstNameProperty(){
	return firstname;
  }

  public final String getLastName(){
	return lastname.get();
  }

  public final void setLastName(String newLastName){
	lastname.set(newLastName);
  }

  public StringProperty lastNameProperty(){
	return lastname;
  }

  @Override
  public int compareTo(Person p){
	int diff =this.getFirstName().compareTo(p.getFirstName());
	if(diff == 0)
	  return this.getLastName().compareTo(p.getLastName());
	return diff;
  }

  @Override
  public String toString(){
	return getFirstName() + " " + getLastName();
  }
}
