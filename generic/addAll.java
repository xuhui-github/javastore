package generic;
import java.util.*;
import java.lang.reflect.Array;


public class addAll{
  @SafeVarargs
  public static <T> void addAll(Collection<T> coll,T... ts){
	for(T elem : ts){
	  coll.add(elem);
	}
  }

  @SafeVarargs public static <E> E[] array(E... array){
    return array;
  }

  public static <T> Pair<T> makePair(Class<T> cl){
	try{
	  return new Pair<>(cl.newInstance(),cl.newInstance());
	}catch(Exception e){
	  return null;
	}
  }

  public static <T extends Comparable> T[] minmax1(T... a){
//	Object[] mm=new Object[2];
    T[] mm =(T[]) Array.newInstance(a.getClass().getComponentType(),2);
	mm[0]=a[1];
	mm[1]=a[2];
	return (T[]) mm;
  }



  public static void main(String[] args){
	Collection<Pair<String>>  table =new ArrayList<Pair<String>>();
	Pair<String> pair1=new Pair<String>("first","second");
	Pair<String> pair2=new Pair<String>("First","Second");
	Pair<String> pair3=new Pair<String>("FIRST","SECOND");

	addAll(table,pair1,pair2,pair3);
	System.out.println(table);

	Pair<String> [] a=array(pair1,pair2);
	System.out.println(a);
	Pair<String> pair4=makePair(String.class);
	System.out.println(pair4);

	String[] ss=minmax1("Tom","Dick","Harry");
	System.out.println(ss);
	System.out.println(ss[0]);
	System.out.println(ss[1]);


  }
}


