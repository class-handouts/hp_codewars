/**
 * This reads in an integer value and outputs its binary value [base 2], its
 * octal value [base 8], and its hexadecimal value [base 16].
 *
 * @author Mr. Dagler
 */

import java.util.*;

class BaseConversion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    System.out.println(input + " =");
    System.out.println("  " + Integer.toString(input, 2) + " base 2,");
    System.out.println("  " + Integer.toString(input, 8) + " base 8,");
    System.out.println("  " + Integer.toString(input, 16) + " base 16.");
  }
}
