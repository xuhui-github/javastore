public enum Season{
  WINTER("this is winter"),SPRING("this is spring"),SUMMER("this is summer"),FALL("this is fall");
  String name;
  Season(String desc){
    this.name=desc;
  }
  public static void main(String[] args){
    for( Season s : Season.values()){
      System.out.println("s.name="+s.name);
      System.out.println("s.ordinal="+s.ordinal());
      System.out.println("s.valueOf(\"WINTER\")="+s.valueOf("WINTER"));
    }
}
}
  
