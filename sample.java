import java.io.FIle;
List<Apple> redApples=filter(inventory,(Apple apple) -> apple.getColor().equals("red"));

List<String> evenNumbers=
filter(number,(Integer i) -> i%2==0)


class ApplePredicate<T>{
  boolean test(T e);
}

public static <T> List<T> filter(List<T> list,ApplePredicate<T> p){
  List<T> result = new ArrayList<T>();
  for(T e : list)
    if(p.test(e))
      result.add(e);
  return result;
}






