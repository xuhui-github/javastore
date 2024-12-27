public class StringIntern{
  public static void main(String[] args){
    String string1="Too many ";
    String string2="cooks";
    String string3="To many cooks";
    string1+=string3;
    string1=string1.intern();
    System.out.println(string1);
    System.out.println(string1.intern());
  }
}
