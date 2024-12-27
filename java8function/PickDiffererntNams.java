package java8function;

import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;

public class PickDifferentNames{
  public static Predicate<String> checkIfStartsWith(final String letter){
	return name -> name.startsWith(letter);
  }
  
  public static void main(String[] args){
	final List<String> friends=Arrays.asList("N1","N2","N3","B1","B3");
	final Predicate<String> startsWithN= name -> name.startsWith("N");
	final Predicate<String> startsWithB= name -> name.startsWith("B");
	final long countFriendsStartN=friends.steam()
	  .filter(startsWithN);
	final long countFriendsStartB=friends.stream()
	  .filter(startWithB);
	
	System.out.println("startsWithN="+startsWithN+" "+"StartsWithB="+startWithB);
  }
}
      
