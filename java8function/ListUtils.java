import java.util.*;
import java.util.function.Function;


public class ListUtils{

  public static Integer fold(List<Integer> is,Integer identity,
	  Function<Integer, Function<Integer,Integer>> f){
	int result=identity;
	for(Integer i : is){
	  result=f.apply(result).apply(i);
	}
	return result;
  }
  /* List<Integer> list=list(1,2,3,4,5,6);
   int result=fold(list,0,x -> y ->x+y;
   
   List<Integer> list=list(1,2,3,4,5);
   String identity="0";
   
   String addSI(String s,Integer i){
     return "(" +s+ " + "+ i + ")";
   }
   
   */
  public static <T, U> U foldLeft(List<T> ts, U identity,
	  Function<U, Function<T, U>> f){
	U result=identity;
	for(T t : ts){
	  result=f.apply(result).apply(t);
	}
	return result;
  }
  /* public static String addSI(String s,Integer i){
   *   return "(" + s + " + "+ i + ")";
   *   }
   *
   * Function<String, Function<Integer,String>> func=(s) -> (i) ->addSI(s,i);
   * List<Integer> list=list(1,2,3,4,5);
   * String result=foldLeft(list,"0",func);
   * System.out.println("result="+result);
   */

  public static <T,U> U foldRight(List<T> ts,U identity,
	  Function<T ,Function<U, U>> f){
	U result=identity;
	for(int i=ts.size();i>0;i--){
	  result=f.apply(ts.get(i-1)).apply(result);
	}
	return result;
  }
  

  /*Function< Integer,<Function<String,String>> foldfun= (ival) -> (res) -> return "(" + ival + "+" +res +")"
 (5+0) (4+(5+0)) (3+(4+(5+0))) ...
 public static addSS(String ival,String res){
   return "(" + ival + "+" + res  + ")";
 }
 List<Integer> list=list(1,2,3,4,5);
 
 Function<Integer, <Function<String,String> foldR=(Integer x) -> (String r) -> addSS(""+x,res);
 String resultFoldRight=foldRight(list,"0",foldR);
 System.out.println("FoldRight(list)="+resultFoldRight);
 */



 public static <T,U> U foldRightRec(List<T> ts, U identity,
	 Function<T,Function<U, U>> f){
   return ts.isEmpty() 
	 ? identity
	 : f.apply(head(ts)).apply(foldRightRec(tail(ts),identity,f));
 }


 public static <T> List<T> reverse(List<T> list){
   List<T> result=new ArrayList<T>();
   for(int i=list.size()-1;i>=0;i--)
	 result.add(list.get(i));
   return Collections.unmodifiableList(result);
 }
 



 public static <T> List<T> copy(List<T> list){
   return new ArrayList<>(list);
 }

 public static <T> List<T> append(List<T> list, T t){
   List<T> ts=copy(list);
   ts.add(t);
   return Collections.unmodifiableList(ts);
 }

 public static <T,U> List<U> mapViaFoldLeft(List<T> list,
	                                        Function<T,U> f){
   return foldLeft(list, list(), x -> y -> append(x,f.apply(y)));
 }

 public static <T> List<T> tail(List<T> list){
   if(list.size() == 0)
	 throw new IllegalStateException("tail of empty list");
   List<T> worklist=copy(list);
   worklist.remove(0);
   return Collections.unmodifiableList(worklist);
 }

 public static <T> List<T> list(){
   return Collections.emptyList();
 }

 public static <T> List<T> list(T t){
   return Collections.singletonList(t);
 }

 public static <T> List<T> list(List<T> ts){
   return Collections.unmodifiableList(new ArrayList<>(ts));
 }

 @SafeVarargs
 public static <T> List<T> list(T... t){
   return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(t,t.length)));
 }


   

 public static <T> T head(List<T> list){
   if(list.size() == 0)
	 throw new IllegalStateException("head of empty list");
   return list.get(0);
 }
}
