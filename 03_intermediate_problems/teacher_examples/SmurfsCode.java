/**
 * A garden gnome told me in a dream that the code to break into the smurfs
 * hidden layer is a ten digit number where each digit only shows up once. This
 * program reads in sever numbers and determines if it has a possibility of
 * being the smurfs code or not. The program ends with a value of zero.
 *
 * This is an example for HPCodeWars 2014 [HPCODEWARSXVII]
 *
 * @author: Mr. Dagler
 *
 * Example Input:
 *      8132504769
 *      0004367193
 *      0987654321
 *      8733311109
 *      0
 *
 * and Output:
 *      Yes
 *      No
 *      Yes
 *      No
 */

import java.util.*;

class SmurfsCode {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String input;
      int[] digitsCount = new int[10];
      boolean canBeTheCode;

      input = sc.next();

      while(!input.equals("0")) {
         for(int i=0; i<10; i++)
            digitsCount[i] = 0;

         for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == '0')
               digitsCount[0]++;
            else if(input.charAt(i) == '1')
               digitsCount[1]++;
            else if(input.charAt(i) == '2')
               digitsCount[2]++;
            else if(input.charAt(i) == '3')
               digitsCount[3]++;
            else if(input.charAt(i) == '4')
               digitsCount[4]++;
            else if(input.charAt(i) == '5')
               digitsCount[5]++;
            else if(input.charAt(i) == '6')
               digitsCount[6]++;
            else if(input.charAt(i) == '7')
               digitsCount[7]++;
            else if(input.charAt(i) == '8')
               digitsCount[8]++;
            else if(input.charAt(i) == '9')
               digitsCount[9]++;
         }

         canBeTheCode = true;
         for(int i=0; i<10; i++) {
            if(digitsCount[i]!=1) {
               canBeTheCode = false;
            }
         }

         if(canBeTheCode)
            System.out.println("Yes");
         else
            System.out.println("No");

         input = sc.next();
      }

   }
}
