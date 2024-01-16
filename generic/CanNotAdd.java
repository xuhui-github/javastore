package generic;
import java.util.*;


class CanNotAdd{
  public static double sum(Collection<? extends Number super Double> ints){
	int sum=0;
	for(Number i : ints) sum=sum+i;
	return sum;
  }


  public static void main(String[] args){
	List<Integer> ints=new ArrayList<Integer>();
	ints.add(1);
	ints.add(2);
	List<? extends Number> nums=ints;
    double db1=sum(nums);
//	List<? super Number> nums1=ints;
//	nums1.add(3.14);
  }
}
