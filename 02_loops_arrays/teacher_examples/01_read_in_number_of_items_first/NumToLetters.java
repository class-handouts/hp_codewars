/**
 * This reads in several postivie integers and then outputs the fist letter of
 * each digit in the number. The frist value in the input is an intger that
 * represents how many how many integers are being read in.
 *
 * @author Mr. Dagler
 *
 * Sample Input:
 *  3
 *  12345
 *  5189
 *  9014
 *
 * Sample Output:
 *  OTTFF
 *  FOEN
 *  NZOF
 */

import java.util.*;

class NumToLetters {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    String number;

    n = sc.nextInt();

    for(int i=0; i<n; i++) {
      number = sc.next();

      for(int j=0; j<number.length(); j++) {
        if(number.charAt(j) == '0') {
          System.out.print("Z");
        }
        else if(number.charAt(j) == '1') {
          System.out.print("O");
        }
        else if(number.charAt(j) == '2') {
          System.out.print("T");
        }
        else if(number.charAt(j) == '3') {
          System.out.print("T");
        }
        else if(number.charAt(j) == '4') {
          System.out.print("F");
        }
        else if(number.charAt(j) == '5') {
          System.out.print("F");
        }
        else if(number.charAt(j) == '6') {
          System.out.print("S");
        }
        else if(number.charAt(j) == '7') {
          System.out.print("S");
        }
        else if(number.charAt(j) == '8') {
          System.out.print("E");
        }
        else if(number.charAt(j) == '9') {
          System.out.print("N");
        }
      }
      System.out.println("");
    }
  }
}
