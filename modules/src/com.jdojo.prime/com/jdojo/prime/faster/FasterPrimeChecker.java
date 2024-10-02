package com.jdojo.prime.faster;

import com.jdojo.prime.PrimeChecker;

public class FasterPrimeChecker implements PrimeChecker{
  private FasterPrimeChecker(){
    //no code
    }

  public static PrimeChecker provider(){
    return new FasterPrimeChecker();
  }

  @Override
  public boolean isPrime(long n){
    //no code
  }
}

