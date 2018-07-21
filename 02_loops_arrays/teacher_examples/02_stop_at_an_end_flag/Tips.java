/**
 * This reads in the cost of several dinner bills and outputs the total cost
 * of the bill with the tax at 8.25% and a tip of 20%. The programs ends with
 * a 0.00;
 *
 * @author Mr. Dagler
 *
 * Example Input:
 *   23.17
 *   108.43
 *   13.01
 *   47.23
 *   31.54
 *   0.00
 *
 * and Output:
 *   $29.72
 *   $139.06
 *   $16.69
 *   $60.57
 *   $40.45
 *
 */


import java.util.*;
import java.lang.*;
import java.text.*;

class Tips {
  public static void main(String[] args) {
    double initalBill, tax, tip, total;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    initalBill = sc.nextDouble();

    while(Math.abs(initalBill) > 0.01) {
      tax = 0.0825*initalBill;
      tip = 0.20*initalBill;
      total = initalBill+tax+tip;

      System.out.println("$" + df.format(initalBill+tax+tip));

      initalBill = sc.nextDouble();
    }
  }
}
