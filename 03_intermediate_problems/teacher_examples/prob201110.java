/**
 * This is my solution to HP CodeWars Problem 10 form 2011.
 *
 * Author: Mr. Dagler
 */

import java.util.*;

class prob201110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ansNumerator=1, ansDenominator=1, denominator1=1, denominator2=1, gcf;

    denominator1 = sc.nextInt();
    while(denominator1 != 0) {
      ansDenominator = denominator1;
      denominator2 = sc.nextInt();
      while(denominator2 != 0) {
        ansNumerator = ansNumerator*denominator2+1*ansDenominator;
        ansDenominator = ansDenominator*denominator2;
        denominator2 = sc.nextInt();
      }
      gcf = gcf(ansNumerator, ansDenominator);
      ansNumerator = ansNumerator / gcf;
      ansDenominator = ansDenominator / gcf;
      System.out.println(ansNumerator + "/" + ansDenominator);
      denominator1 = sc.nextInt();
      denominator2 = 1;
      ansNumerator=1;
    }
  }
  static int gcf(int a, int b){
    int c;
    for(;;) {
      c = a%b;
      if(c==0) {
        return b;
      }
      a = b;
      b = c;
    }
  }
}
