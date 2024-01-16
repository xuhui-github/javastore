package function;

import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.function.BinaryOperator;


public class function1{

  public static <T> List<T> asList(T... a){
	return Arrays.<T>asList(a);
  }

  public static boolean isDigit(char ch){
	return ch >= '0' && ch <= '9';
  }
	

  public static void main(String[] args){
	List<String> beginningWithNumber=new ArrayList<>();
	for(String value : asList("a","1abc","abc1")){
	  if(isDigit(value.charAt(0)))
		  beginningWithNumber.add(value);
	}

	//assertEquals(asList("1abc"),beginnigWithNumber);
	assert asList("1abc").equals(beginningWithNumber);
    
	List<String> beginingWithNumber=Stream.of("a","1abc","abc1")
	  .filter(value -> isDigit(value.charAt(0)))
	  .collect(toList());
	System.out.println(beginingWithNumber);


//	BinaryOperator<Long> addLongs =(x,y) -> x + y;


	
  }
}
	
