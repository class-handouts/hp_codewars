/**
 * This is my solution to HP CodeWars Problem 2 form 2011.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201102 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long value, nextValue, originalValue;
    long unitDigit;

    value = sc.nextLong();
    originalValue = value;

    while(value > 100) {
      nextValue = value / 10;
      unitDigit = value - 10*nextValue;
      nextValue = nextValue - unitDigit;
      System.out.println(nextValue);
      value = nextValue;
    }

    System.out.println("");
    if(value % 11 == 0) {
      System.out.println("The number " + originalValue
      + " is divisible by 11");
    }
    else {
      System.out.println("The number " + originalValue
      + " is NOT divisible by 11");
    }
  }
}
