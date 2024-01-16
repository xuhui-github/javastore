package java8function;
import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;
public class FunWithCollection{
  public static void main(String[] args){
	final List<String> friends= Arrays.asList("Brian","Nate","Neal","Raju","Sara","Scott");
	final List<String> editors=Arrays.asList("Brian","Jackie","John","Mike");
	final List<String> comrades=Arrays.asList("Kate","Ken","Nick","Paula","Zach");
	final long countFriendsStartN=friends.stream().filter(name -> name.startsWith("N")).count();
	final long countEditorsStartN=editors.stream().filter(name -> name.startsWith("N")).count();
	final long countComradesStartN=comrades.stream().filter(name -> name.startsWith("N")).count();
    System.out.println(countFriendsStartN+" "+countEditorsStartN+" "+countComradesStartN);
	final Predicate<String> startsWithN=name -> name.startsWith("N");
	
	
  }
}

