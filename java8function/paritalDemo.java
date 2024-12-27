package java8function;
import java.util.function.*;

public class paritalDemo{
	static <A, B, C> Function<B, C> partial(A a, Function<A, Function<B, C>>f){
	  return f.apply(a);
	}
	public static void main(String[] args){
	  int val =partial(1, (Integer a) -> {
		if(a>0)
		  return (Integer x) -> x+1;
		else
		  return (Integer x) -> x-1;
	  }).apply(3);
	System.out.println("result= "+val);
  }
}
