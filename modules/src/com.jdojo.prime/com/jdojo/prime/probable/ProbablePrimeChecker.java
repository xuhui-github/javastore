package com.jdojo.prime.probable;

import com.jdojo.prime.PrimeChecker;

import java.math.BigInteger;

public interface ProbablePrimeChecker extends PrimeChecker {
  public static ProbablePrimeChecker provider(){
    int certainty=1000;
    PorablePrimeChecker checker=n - >BigInteger.valueOf(n).isProbablePrime(certainty);
    return checker;
  }
}
