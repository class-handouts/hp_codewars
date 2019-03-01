/**
 * This reads the name and the heigh (in) of n people and outputs
 * the person or peope that are the tallest.
 *
 * @author Mr. Dagler
 *
 * Example Input:
 *   5
 *   Dave 56
 *   Lisa 71
 *   Kim 48
 *	 Micaela 71
 *   Mike 39
 *
 * and Output:
 *   Lisa Micaela
 *
 */


import java.util.*;

class Tallest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] names = new String[n];
    String[] tallNames = new String[n];
    int[] heights = new int[n];
    int talestHeight = 0;

    for(int i=0; i<n; i++) {
      names[i] = sc.next();
      heights[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++) {
      if(talestHeight <= heights[i]) {
        talestHeight = heights[i];
      }
    }

  for(int i=0; i<n; i++) {
    if(talestHeight == heights[i])
      System.out.print(names[i] + " ");
    System.out.println("");
  }
}
