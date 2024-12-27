import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ApplePredicateDemo{
  public static List<Apple> filterApples(List<Apple> inventory,
                                         ApplePredicate p){
    List<Apple> result = new ArrayList<>();
    for(Apple apple : inventory)
      if(p.test(apple))
	result.add(apple);
    return result;
  }

  public static void prettyPrintApple(List<Apple> inventory,
                                      AppleFormatter formatter){
    for(Apple apple : inventory){
      String output=formatter.accept(apple);
      System.out.println(output);
    }
  }

  public static <T> List<T> filter(List<T> list, Predicate<T> p){
    List<T> result=new ArrayList<T>();
    for(T e : list){
      if(p.test(e))
	result.add(e);
    }
    return result;
  }


  public static void main(String[] args){

    List<Apple> apples=Arrays.asList(new Apple("green",900),new Apple("red",28),
	                             new Apple("green",100));
    List<String> strs=Arrays.asList("first","second","third");
    List<Apple> result=filterApples(apples,new AppleRedAndHeavyPredicate());
    System.out.println(result);

    List<Apple> redApples=filterApples(apples,new ApplePredicate(){
      public boolean test(Apple apple){
	return apple.getColor().equals("red");
      }
    });
    System.out.println(redApples);

    result=filterApples(apples,(Apple apple) -> apple.getColor().equals("red"));
    System.out.println(result);

    
    redApples=filter(apples,(Apple apple) -> apple.getColor().equals("red"));
    System.out.println(redApples);

    List<String> evenNumbers=filter(strs,(String str)-> str.length()%2 ==0);
    System.out.println(evenNumbers);
    apples.sort((Apple a,Apple b) ->
	          new Integer(a.getWeight()).compareTo(new Integer(b.getWeight())));
    System.out.println(apples);
    Comparator<Apple> comp=new Comparator<Apple>(){
      public int compare(Apple a,Apple b){
	if(a.getWeight()>b.getWeight())
	  return -1;
	else if(a.getWeight()<b.getWeight())
	  return 1;
	else
	  return 0;
      }
    };
    apples.sort(comp);
    System.out.println(apples);


  }
}


  

