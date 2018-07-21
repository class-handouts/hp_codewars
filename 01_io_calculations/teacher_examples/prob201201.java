/**
 * This is my solution to HP CodeWars Problem 1 form 2011.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201201 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    double answer = input/3.785;

    System.out.println(Math.round(answer));
  }
}
