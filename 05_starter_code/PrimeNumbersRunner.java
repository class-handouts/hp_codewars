/**
 * This is a class to help with prime numbers for the HP 
 * CodeWars computition.
 * 
 * @author Mr. Dagler
 */

import java.util.ArrayList;

public class PrimeNumbersRunner
{
   public static void main(String[] args) 
   {
      PrimeNumbers primeNumbers = new PrimeNumbers();
      int n = 2019;

      System.out.println(primeNumbers.getList(50));

      if(primeNumbers.isPrime(n))
         System.out.println(n + " is a prime number");
      else
         System.out.println(n + " is a composite number");

      n = 7907;
      if (primeNumbers.isPrime(n))
         System.out.println(n + " is a prime number");
      else
         System.out.println(n + " is a composite number");
   }
}

class PrimeNumbers 
{
    private ArrayList<Integer> primeNums;

    public PrimeNumbers() 
    {
        primeNums = new ArrayList<Integer>();
    }

   /** This list the first n prime number.
    * 
    * @param n The number of primes to return
    * @return The frist n primes stored in an ArrayList.
    */
    ArrayList getList(int n) 
    {
        int currentNumPrimes = 1, val = 2;
        boolean isPrime;

        while (currentNumPrimes <= n) 
        {
            if (primeNums.size() == 0) 
            {
                primeNums.add(val);
                currentNumPrimes++;
            } 
            else 
            {
                val++;
                isPrime = true;
                for (int primeNum : primeNums) 
                {
                    if (val % primeNum == 0) 
                    {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) 
                {
                    primeNums.add(val);
                    currentNumPrimes++;
                }
            }
        }
        return primeNums;
    }

    public boolean isPrime(int n) 
    {
        int sqrtN = (int)Math.sqrt(n)+1;

        for(int i=2; i<sqrtN; i++)
        {
            if (n % i == 0)
            return false;
        }
        return true;
    }
}