package java8function;
import java.util.function.Function;
public class BinaryOperatorDemo{
  public static Double cos(Double arg){
	return Function.compose(z -> Math.PI/2 -z,
		                   // a -> Math.sin(a)).apply(arg);
						   (Function<Double,Double>) (a) -> Math.sin(a)).apply(arg);
  }

  public static void main(String[] args){
    Function<Integer,Function<Integer,Integer>> add= x -> y -> x + y;
	System.out.println(add.apply(3).apply(4));
	System.out.println(cos(90.0));
  }
}
