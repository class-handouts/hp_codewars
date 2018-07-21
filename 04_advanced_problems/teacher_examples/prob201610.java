/**
 * This is my solution to HP CodeWars Problem 10 form 2016.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class prob201610 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();

    while(!input.equals("=========")) {
      if(!getWin(input, 'X').equals("")) {
        System.out.println("Player X won.");
        System.out.println(getWin(input, 'X'));
      }
      else if(!getWin(input, 'O').equals("")){
        System.out.println("Player O won.");
        System.out.println(getWin(input, 'O'));

      }
      else {
        System.out.println("There was a tie.");
        System.out.println(input.substring(0,3));
        System.out.println(input.substring(3,6));
        System.out.println(input.substring(6,9));
      }

      System.out.println();
      input = sc.next();
    }

  }

  /**
   * @param b The Tic-Tac-Toe board
   * @param p The Tic-Tac-Toe Player 'X' or 'O'
   * @return The winning board, it there is one and "" otherwise.
   */
  static String getWin(String b, char p) {
    String answer = "";

    // Looking for a Row Win.
    if(p == b.charAt(0) && p == b.charAt(1) && p == b.charAt(2)) {
      answer = "$$$\n"
      + b.charAt(3) + b.charAt(4) + b.charAt(5) + "\n"
      + b.charAt(6) + b.charAt(7) + b.charAt(8) + "\n";
      return answer;
    }
    else if(p == b.charAt(3) && p == b.charAt(4) && p == b.charAt(5)) {
      answer = "" + b.charAt(0) + b.charAt(1) + b.charAt(2) + "\n"
      + "$$$\n"
      + b.charAt(6) + b.charAt(7) + b.charAt(8) + "\n";
      return answer;
    }
    else if(p == b.charAt(6) && p == b.charAt(7) && p == b.charAt(8)) {
      answer = "" + b.charAt(0) + b.charAt(1) + b.charAt(2) + "\n"
      + b.charAt(3) + b.charAt(4) + b.charAt(5) + "\n"
      + "$$$\n";
      return answer;
    }

    // Looking for a Column Win.
    if(p == b.charAt(0) && p == b.charAt(3) && p == b.charAt(6)) {
      answer = "$" + b.charAt(1) + b.charAt(2) + "\n"
      + "$" + b.charAt(4) + b.charAt(5) + "\n"
      + "$" + b.charAt(7) + b.charAt(8) + "\n";
      return answer;
    }
    else if(p == b.charAt(1) && p == b.charAt(4) && p == b.charAt(7)) {
      answer = b.charAt(0) + "$" + b.charAt(2) + "\n"
      + b.charAt(3) + "$" + b.charAt(5) + "\n"
      + b.charAt(6) + "$" + b.charAt(8) + "\n";
      return answer;
    }
    else if(p == b.charAt(2) && p == b.charAt(5) && p == b.charAt(8)) {
      answer = "" + b.charAt(0) + b.charAt(1) + "$\n"
      + b.charAt(3) + b.charAt(4) + "$\n"
      + b.charAt(6) + b.charAt(7) + "$\n";
      return answer;
    }

    // Looking for a Diagonal Win.
    if(p == b.charAt(0) && p == b.charAt(4) && p == b.charAt(8)) {
      answer = "$" + b.charAt(1) + b.charAt(2) + "\n"
      + b.charAt(3) + "$" + b.charAt(5) + "\n"
      + b.charAt(6) + b.charAt(7) + "$\n";
      return answer;
    }
    else if(p == b.charAt(2) && p == b.charAt(4) && p == b.charAt(6)) {
      answer = "" + b.charAt(0) + b.charAt(1) + "$\n"
      + b.charAt(3) + "$" + b.charAt(5) + "\n"
      + "$" + b.charAt(7) + b.charAt(8) + "\n";
      return answer;
    }

    return answer;
  }
}
