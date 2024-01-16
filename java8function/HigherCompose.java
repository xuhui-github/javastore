package java8function;

import java.util.function.*;

public class HigherCompose{
  static <T, U, V> Function<Function<U, V>,
	               Function<Function<T, U>,
				   Function<T,V>>> highercompose() {
    return x -> y -> z -> x.apply(y.apply(z));
  }

public static void main(String[] args){
}
}
	               
