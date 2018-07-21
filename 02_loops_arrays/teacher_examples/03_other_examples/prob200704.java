/**
 * This is my solution to HP CodeWars Problem 4 form 2007.
 *
 * @author Mr. Dagler
 */

import java.util.*;
import java.lang.*;

public class prob200704 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String password;
    int score = 0;
    boolean hasLowerCase=false, hasUpperCase=false, hasNumberSymbol=false;

    System.out.print("Enter your password: ");
    password = sc.next();

    for(int i=0; i<password.length(); i++) {
      if(Character.isLowerCase(password.charAt(i))) {
        hasLowerCase = true;
      }
      else if(Character.isUpperCase(password.charAt(i))) {
        hasUpperCase = true;
      }
      else if(!Character.isWhitespace(password.charAt(i))) {
        hasNumberSymbol = true;
      }
    }

    if(password.length() >= 8) {
      score = score+1;
    }
    if(hasLowerCase && hasUpperCase) {
      score = score+1;
    }
    if(hasNumberSymbol){
      score = score+1;
    }

    if(score == 3) {
      System.out.println("This password is STRONG");
    }
    else if(score == 2) {
      System.out.println("This password is GOOD");
    }
    else if(score == 1) {
      System.out.println("This password is ACCEPTABLE");
    }
    else {
      System.out.println("This password is WEAK");
    }
  }
}
