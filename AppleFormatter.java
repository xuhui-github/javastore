public interface AppleFormatter{
  String accept(Apple a);
}

class AppleFancyFomatter implements AppleFormatter{
  public String accept(Apple a){
    String characteristic=a.getWeight()>50 ? "heavy" : "light";
    return "A " + characteristic+""+a.getColor()+" apple";
  }
}

class AppleSimpleFormatter implements AppleFormatter{
  public String accept(Apple a){
    return "An apple of"+a.getWeight()+"g";
  }
}

