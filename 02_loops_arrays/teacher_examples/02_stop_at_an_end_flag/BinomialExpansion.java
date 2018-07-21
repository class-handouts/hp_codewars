/**
 * This program reads in several coefficients of binomial expressions A*x+B and
 * then and finds a, b, and c for (A*x+B)^2=a*x^2+b*x+c. A and B are integer
 * values and the input will end with 0 0.
 *
 * @author Mr. Dagler
 *
 * Example Input:
 *   1 2
 *   5 3
 *   7 -5
 *   0 0
 *
 * and Output:
 *   1 4 4
 *   25 30 9
 *   49 -70 25
 */


import java.util.*;

class BinomialExpansion {
  public static void main(String[] args) {
    int A, B;
    Scanner sc = new Scanner(System.in);

    A = sc.nextInt();
    B = sc.nextInt();

    while(A!=0 &&  B!=0) {
      System.out.println(A*A + " " + 2*A*B + " " + B*B);
      A = sc.nextInt();
      B = sc.nextInt();
    }
  }
}
