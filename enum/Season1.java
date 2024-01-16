public enum Season1{
  WINTER("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");
  private String expectedVisitors;
  private Season1(String expectedVisitors){
    this.expectedVisitors=expectedVisitors;
  }
  public void printExpectedVisitors(){
    System.out.println(expectedVisitors);
  }
  public static void main(String[] args){
    for(Season1 s : Season1.values()){
      System.out.println(s.ordinal());
      System.out.println(s.name());
      System.out.println(s.valueOf(s.name()));
    }
  }
}
