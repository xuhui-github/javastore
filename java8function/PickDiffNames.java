package java8function;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class PickDiffNames{
  public static void main(String[] args){



	final Function<String,Predicate<String>> startWithLetter= // String, Predicate<String>
	  (letter) -> { //参数是字符串
		Predicate<String> checkStarts = (String name) -> name.startsWith(letter); //返回一个以字符串为参数的函数
		return checkStarts;
	  };

	final Function<Integer,Predicate<String>> lengthAbove= //定义一个参数为整数，返回值是一个字符串参数的函数Integer,Function<String>/Predicate
	  (num) -> {
		Predicate<String> numsAbove = (String name) -> name.length() > num;
		return numsAbove;
	  };


	final Function<Integer,Predicate<String>> another=
	  (number) -> {
		Predicate<String> RetToAnotherFun=(String name) -> name.length() == number;
		return RetToAnotherFun;
	  };


//final Function<String, Predicate<String>> startWithLetter =
//  (String letter) -> (String name) -> name.startsWith(letter);
//
//final Function<String, Predicate<String>> startsWithLetter =
//  letter -> name -> name.startsWith(letter);
//








	final List<String> friends = Arrays.asList("Alice","Bob","Tom","Ted","Amanda");
	long countOfA=friends.stream().filter(startWithLetter.apply("A")).count();
	System.out.println("Friends'name starts with A count= "+countOfA);
	long countLenAbove3=friends.stream().filter(lengthAbove.apply(3)).count();
	System.out.println("Count name length above 3 = "+countLenAbove3);
	
	long count=friends.stream().filter(another.apply(3)).count();
	friends.stream().forEach(System.out::println);
  }
}

 
