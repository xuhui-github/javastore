package org.acem.wordcount;

public class WordCount{
  public static void main(String[] args){
    int counter=0;
    if(args.length>0){
      for(String arg:args){
	System.out.println("Position " + counter + ": " +args.length);
	counter++;
      }
    }
  }
}
