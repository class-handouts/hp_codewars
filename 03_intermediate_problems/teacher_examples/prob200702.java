/**
 * This is my solution to HP CodeWars Problem 2 form 2007.
 *
 * @author Mr. Dagler
 */

import java.util.*;

public class prob200702 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String[] names = new String[16];
    int n = 0, longestName = -1;

    System.out.print("Enter team name: ");
    names[n] = sc.nextLine();
    System.out.println();

    while(!names[n].equals("END")) {
      if(longestName < names[n].length())
      longestName = names[n].length();

      n++;
      System.out.print("Enter team name: ");
      names[n] = sc.nextLine();
      System.out.println();

    }

    for(int i=0; i<longestName; i++) {
      for(int j=0; j<n; j++) {
        if(i<names[j].length()) {
          System.out.print(names[j].charAt(i) + " ");
        }
        else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
