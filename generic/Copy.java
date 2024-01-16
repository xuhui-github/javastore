package generic;

import java.util.*;

class MyCollection {
  public static <T> void copy(List<? super T> dist,List<? extends T> src){
	for(int i=0;i<src.size();i++)
	  dist.set(i,src.get(i));
  }
}

public class Copy{
  public static void count(Collection<? super Integer> ints, int n){
	for(int i=0;i<n;i++)
	  ints.add(i);
  }

  public static double sum(Collection<? extends Number> nums){
	double s=0.0;
	for(Number num : nums) s += num.doubleValue();
	return s;
  }

  public static double sumCount(Collection<Number> nums,int n){
	count(nums,n);
	return sum(nums);
  }


  public static void main(String[] args){
	List<Object> objs=Arrays.<Object>asList(2,3.14,"four");
    List<Integer>ints=Arrays.asList(5,6);
	MyCollection.copy(objs,ints);
	System.out.println(objs);
	assert objs.toString().equals("[5, 6, four]");


	List<Integer> intsa =new ArrayList<Integer>();
	intsa.add(1);
	intsa.add(2);
	List<? extends Number> nums=intsa;
	double db1=sum(nums);
	//nums.add(3.14);
	
//	List<? super Object> objs1=intsa;
//	List<? super Integer> nums1=objs1;
//	nums1.add(3.14);
   
	List<Object> objs1=new ArrayList<Object>();
	objs1.add(1);
	objs1.add(2);
	objs1.add("three");
	List<? super Number> num1=objs1;
	num1.add(null);
    num1.add(3);    
	double db2=sum(num1);

  }
}
