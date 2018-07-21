/**
 * This is my solution to HP CodeWars Problem 8 form 2016.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201608 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, numOfSpaces;
    String word;

    n = sc.nextInt();

    for(int i=0; i<n; i++) {
      word = sc.next();
      numOfSpaces = word.length()-1;

      for(int j=0; j<word.length(); j++) {
        for(int k=0; k<word.length(); k++) {
          if(k<numOfSpaces)
            System.out.print(" ");
          else
            System.out.print(word.charAt(k-numOfSpaces));
        }
        numOfSpaces--;
        System.out.println("");
      }
      for(int j=1; j<word.length(); j++) {
        for(int k=j; k<word.length(); k++) {
          System.out.print(word.charAt(k));
        }
        System.out.println("");
      }
    }
  }
}
