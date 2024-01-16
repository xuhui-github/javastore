


import java.io.InputStream;
import java.io.File;n

public class Person{
    String name;
     int age;
     String address;
    Person(String name,int age){
	this.name=name;
	this.age=age;
    }
    Person(String name,int age,String address){
      this(name,age);
      this.address=address;
    }
    public void setName(String name){
	this.name=name;
    }

    public void setAge(int age){
      this.age=age;
    }

    public int getAge(){
      return this.age;
    }
    
    
    public String getName(){
	return name;
    }
    public void setAddress(String address){
      this.address=address;
    }
    public String getAddress(){
      return address;
    }


  public static void main(String[] args){
    System.out.println("Person");
    System.out.println();
    System.out.print("hello");

}

}
