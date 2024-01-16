import java.util.List;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import java.io.File;
import java.io.InputStream;




public class Apple{
  String color;
  int weight;
  Apple(String color){
    this.color=color;
  }
  Apple(String color,int weight){
    this.color=color;
    this.weight=weight;
  }

  String getColor(){
    return color;
  }

  int getWeight(){
    return weight;
  }

  public String toString(){
    return "[Apple: "+color+"weight: "+weight+"]";
  }



  public static List<Apple> filterGreenApples(List<Apple> inventory){
    List<Apple> result=new ArrayList<Apple>();
    for(Apple apple : inventory)
      if(apple.getColor().equals("green"))
	result.add(apple);
    return result;
  }

  public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
    List<Apple> result=new ArrayList<Apple>();
    for(Apple apple : inventory)
      if(apple.getColor().equals(color))
	result.add(apple);
    return result;
  }

    

  public static List<Apple> filterAppleByWeight(List<Apple> inventory,int weight){
    List<Apple> result=new ArrayList<Apple>();
    for(Apple apple : inventory)
      if(apple.getWeight()>weight)
	result.add(apple);
    return result;
  }

  public static List<Apple> filterApples(List<Apple> inventory,String color,int
      weight,boolean flag){
    List<Apple> result=new ArrayList<Apple>();
    for(Apple apple : inventory){
      if((flag && apple.getColor().equals(color)) ||
	  (!flag && apple.getWeight() > weight)){
	result.add(apple);
	  }
    }
    return result;
      }
     


  public static void main(String[] args){
    Apple apples[]={new Apple("green"),new Apple("red"),new Apple("green")};
    List<Apple> inventory=Arrays.asList(apples);
    List<Apple> inventory1=Arrays.asList(new Apple("green"),new Apple("red"));
    System.out.println(inventory1.size());
    List<Apple> result=filterGreenApples(inventory);
    System.out.println(result);
    result=filterApplesByColor(inventory,"red");
    System.out.println(result);
    javax.swing.JButton btn=new javax.swing.JButton("OK");
    btn.setText("click");
    System.out.println(btn.getText());
    System.out.println(btn.getBounds());
    
    
    
    
  }



}

