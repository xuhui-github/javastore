package generic;

public class PairTest1{
  public static void main(String[] args){
	String[] words= { "Mary","had","a","little","lamb"};
	Pair<String> mm=ArrayAlg.minmax(words);
	System.out.println("min="+mm.getFirst());
	System.out.println("max="+mm.getSecond());
	
	String middle=ArrayAlg.<String>getMiddle("John","Q.","Public");
	System.out.println(middle);
	
	double dmiddle=ArrayAlg.<Double>getMiddle(3.14,1729.0,0.0);
	System.out.println(dmiddle);

    String minstring=ArrayAlg.<String>min(new String[] {"first","second","third"});
	double mindouble=ArrayAlg.<Double>min(new Double[]{0.1,-2.0,3.0});
	System.out.println("minstring="+minstring);
	System.out.println("mindouble="+mindouble);
  }
}
