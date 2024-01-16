import java.util.Map;
public interface ApplePredicate{
 
  
  boolean test(Apple apple);
}

class AppleHeavyWeightPredicate implements ApplePredicate{
  public boolean test(Apple apple){
    return apple.getWeight()>150;
  }
}
class AppleGreenColorPredicate implements ApplePredicate{
  public boolean test(Apple apple){
    return apple.getColor().equals("green");
  }
}
class AppleRedAndHeavyPredicate implements ApplePredicate{
  public boolean test(Apple apple){
    return apple.getColor().equals("red")&&apple.getWeight()>150;
  }
}

