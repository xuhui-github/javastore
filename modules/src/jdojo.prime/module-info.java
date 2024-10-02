module jdojo.prime {
  exports com.jdojo.prime;
  uses com.jdojo.prime.PrimeChecker;
 
  provides com.jdojo.prime.PrimeChecker
    with com.jdojo.prime.impl.GenericPrimeChecker;
}

