/**
 * This fist reads in how many integers that are going to be inputed. Then it
 * reads in these integers and outputs the average of these values.
 *
 * @author Mr. Dagler
 *
 * Example Input:
 *   9
 *   1 9 4 2 8 17 -4 11 94
 *
 * and Output:
 *   avg = 15.777777777777779
 *
 */


import java.util.*;

class Avg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, sum;
    int input;

    n = sc.nextInt();
    sum = 0;

    for(int i=0; i<n; i++) {
   	  input = sc.nextInt();
      sum = sum + input;
    }

    System.out.println("avg = " + 1.0*sum/n);
  }
}
