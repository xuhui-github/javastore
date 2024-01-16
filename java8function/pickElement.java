package java8function;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Optional;


public class pickElement{
  public static void pickName(final List<String> names,final String startingLetter){
	String foundName=null;
	for(String name : names)
	  if(name.startsWith(startingLetter)){
		foundName=name;
	    break;
	  }
	System.out.print(String.format("A name starting with %s",startingLetter));
	if(foundName == null)
	  System.out.println("No name found");
	else
	  System.out.println(foundName);
  }

  public static void pickNameWithStream(final List<String> names,final String startingLetter){
	final Optional<String> foundNames =
	  names.stream()
	  .filter(name -> name.startsWith(startingLetter))
	  .findFirst();
    System.out.println(String.format("A name starting with %s: %s",startingLetter,foundNames.orElse("No name found")));
  }



  public static void main(String[] args){
	List<String> names=Arrays.asList("Nick","Amanda","Ted","Sara");
	pickName(names,"Sara");
	pickName(names,"Tidy");
	pickName(names,"Amanda");
  }
}
