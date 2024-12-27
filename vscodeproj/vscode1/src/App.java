import java.io.*;

import java.sql.*;
import java.util.ArrayList;

class Person{
    String name;
    int age;
    String addr;
    public Person(String name,int age,String addr){
        this.name=name;
        this.age=age;
        this.addr=addr;
    }
    public Person(){
        this("unknown",0,"unknown addr");
    }

    public 
    String getName(){
        return this.name;
    }
    public int getAge(){
        return age;
    }
    public String getAddr(){
        return addr;
    }
    public String toString(){
        return this.name+","+this.age+","+this.addr;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<Person> list=new ArrayList<Person>();
        list.add(new Person("first",23,"firstaddr"));
        list.add(new Person());
        System.out.println(list);
        System.out.println(list.size());
        
    }
}
