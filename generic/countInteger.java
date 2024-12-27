package generic;

import java.util.*;

public class countInteger{
  public static void count(Collection<? super Integer> ints,int n){
	for(int i=0;i<n;i++) ints.add(i);
	
  }

  public static void main(String[] args){
	List<Integer> ints=new ArrayList<Integer>();
	count(ints,5);
	assert ints.toString().equals("[0, 1, 2, 3, 4]");

	List<Number> nums=new ArrayList<Number>();
	count(nums,5);nums.add(5.0);
	assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");

	List<Object> objs=new ArrayList<Object>();
	count(objs,5);objs.add("five");
	System.out.println(objs.get(0));
	assert objs.toString().equals("[0, 1, 2, 3, 4, five]");
	
	objs.add(1);
	objs.add("two");
	System.out.println(objs);

	List<? super Integer> ints1=objs;
	ints1.add(3);
	count(ints1,3);
	System.out.println(ints1);
  }
}

	  
