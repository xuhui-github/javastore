public enum OnlyOne{
  ONCE(true);
  private OnlyOne(boolean b){
    System.out.println("constructing");
  }
  public static void main(String[] args){
    OnlyOne first=OnlyOne.ONCE;
    OnlyOne second=OnlyOne.ONCE;
    System.out.println(first);
    System.out.println(second);
  }
}
