/**
 * This is my solution to HP CodeWars Problem 3 form 2010.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201003 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int currentNum = input;
    int maxTry = 10000;
    int currentTry = 0;

    for(;;) {
      currentNum = sumDigitSquars(currentNum);
      currentTry = currentTry + 1;

      if(currentNum == 1) {
        System.out.println(input + " is a happy number.");
        break;
      }
      else if(currentTry > maxTry) {
        System.out.println(input + " is an uhappy number.");
        break;
      }
    }
  }

  static int sumDigitSquars(int num) {
    int answer = 0;

    while(num != 0) {
      answer += (num%10)*(num%10);
      num = num /10;
    }

    return answer;
  }
}
