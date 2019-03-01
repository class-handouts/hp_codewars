/**
 * This is my solution to HP CodeWars Problem 15 form 2009.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob200915 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfCandies, numOfGuesses, cloestGuessDiff;
    int[] guesses = new int[30];
    String[] names = new String[30];

    numOfCandies = sc.nextInt();
    numOfGuesses = sc.nextInt();
    cloestGuessDiff = 999999;

    for(int i=0; i<numOfGuesses; i++) {
      guesses[i] = sc.nextInt();
      names[i] = sc.next();

      if(cloestGuessDiff > Math.abs(guesses[i]-numOfCandies)) {
        cloestGuessDiff = Math.abs(guesses[i]-numOfCandies);
      }
    }

    for(int i=0; i<numOfGuesses; i++) {
      if(cloestGuessDiff == Math.abs(guesses[i]-numOfCandies)) {
        System.out.print(names[i] + " ");
      }
    }
    System.out.println("");
  }
}
