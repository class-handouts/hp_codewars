/**
 * This is my solution to HP CodeWars Problem 3 form 2008.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob200803 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String L1 = "";
    String L2 = "";
    int n = sc.nextInt();

    while(n != 0) {
      for(int i=0; i<4; i++) {
        for(int j=0; j<n; j++) {
          L1 = L1 + "#";
          L2 = L2 + ".";
        }
        for(int j=0; j<n; j++) {
          L1 = L1 + ".";
          L2 = L2 + "#";
        }
      }

      for(int i=0; i<4; i++) {
        for(int j=0; j<n; j++) {
          System.out.println(L1);
        }
        for(int j=0; j<n; j++) {
          System.out.println(L2);
        }
      }
      n = sc.nextInt();
      System.out.println("\n");
      L1 = "";
      L2 = "";
    }
  }
}
