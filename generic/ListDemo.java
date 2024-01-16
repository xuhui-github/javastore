package generic;
import java.util.*;

public class ListDemo{

  public static double sum(Collection<? extends Number> nums){
	double s=0.0;
	for(Number num : nums) s+=num.doubleValue();
	return s;
  }

  public static void count(Collection<? super Integer> ints,int n){
	for(int i=0;i<n;i++) ints.add(i);
  }

  public static <T> void copy(List<? super T> dist,List<? extends T> src){
	for(int i=0;i<src.size();i++){
	  dist.set(i,src.get(i));
	}
  }


public static void main(String[] args){
  List<Object> objs=new ArrayList<Object>();
  objs.add(1);
  objs.add("two");
  List<? super Integer> ints=objs;
  ints.add(3);
//  double db1=sum(ints);

  List<Integer> integers=new ArrayList<Integer>();
  count(integers,5);
  assert integers.toString().equals("[0, 1, 2, 3, 4]");
  
  System.out.println("sum= "+sum(integers));
 // System.out.println("sum= "+sum(objs));
 
  List<Object> objs1=Arrays.<Object>asList(2,3.14,"four");
  List<Integer> ints1=Arrays.asList(5,6);
  copy(objs1,ints1);
  System.out.println(objs1);

  List<?> list=new ArrayList<Object>();
}
}
