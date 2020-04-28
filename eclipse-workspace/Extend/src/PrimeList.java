
import java.util.*;
import java.math.BigInteger;

public class PrimeList implements Runnable {
  private ArrayList<BigInteger> primesFound;
  private int numPrimes, numDigits;

  /** Finds numPrimes prime numbers, each of which is
   *  numDigits long or longer. You can set it to return
   *  only when done, or have it return immediately,
   *  and you can later poll it to see how far it
   *  has gotten.
   */
  
  public PrimeList(int numPrimes, int numDigits,
                   boolean runInBackground) {
    primesFound = new ArrayList<BigInteger>(numPrimes);
    this.numPrimes = numPrimes;
    this.numDigits = numDigits;
    if (runInBackground) {
      Thread t = new Thread(this);
      // Use low priority so you don't slow down server.
      t.setPriority(Thread.MIN_PRIORITY);
      t.start();
    } else {
      run();
    }
  }

  public void run() {
    BigInteger start = Primes.random(numDigits);
    for(int i=0; i<numPrimes; i++) {
      start = Primes.nextPrime(start);
      synchronized(this) {
        primesFound.add(start);
      }
    }
  }

  public synchronized boolean isDone() {
    return(primesFound.size() == numPrimes);
  }

  public synchronized ArrayList<BigInteger> getPrimes() {
    if (isDone())
      return(primesFound);
    else
      return((ArrayList)primesFound.clone());
  }

  public int numDigits() {
    return(numDigits);
  }
  
  public int numPrimes() {
    return(numPrimes);
  }
  
  public synchronized int numCalculatedPrimes() {
    return(primesFound.size());
  }
}
