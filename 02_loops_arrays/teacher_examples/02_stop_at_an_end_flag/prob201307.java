/**
 * This is my solution to HP CodeWars Problem 7 form 2013.
 *
 * The directions are a little confusing to me. This is how I read the
 * problem; the minute hand and the hour hand are always mirror images of
 * each other about the line that goes through the 12 and 6.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201307 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    while(input != -1) {
      if(input == 0) {
        System.out.println("12:00");
      }
      else if(input <= 5) {
        System.out.println("11:0" + input);
      }
      else if(input <= 9) {
        System.out.println("10:0" + input);
      }
      else if(input == 10) {
        System.out.println("10:00");
      }
      else if(input <= 15) {
        System.out.println("9:" + input);
      }
      else if(input <= 20) {
        System.out.println("8:" + input);
      }
      else if(input <= 25) {
        System.out.println("7:" + input);
      }
      else if(input <= 30) {
        System.out.println("6:" + input);
      }
      else if(input <= 35) {
        System.out.println("5:" + input);
      }
      else if(input <= 40) {
        System.out.println("4:" + input);
      }
      else if(input <= 45) {
        System.out.println("3:" + input);
      }
      else if(input <= 55) {
        System.out.println("2:" + input);
      }
      else if(input <= 59) {
        System.out.println("1:" + input);
      }

      input = sc.nextInt();
    }
  }
}
