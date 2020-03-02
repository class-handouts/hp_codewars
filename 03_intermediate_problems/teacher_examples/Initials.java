/**
 * This program reads in severl peoples' name where each name is on a single
 * line. The program then outputs the initials of each person. The input will
 * end with the word "END".
 *
 * @author Mr. Dagler
 *
 * Example Input:
 *    Thomas Cruise Mapother
 *    Michael Jeffrey Jordan
 *    Ronald Wilson Reagan
 *    William Henry Gates
 *    Clay Dagler
 *    Adam James Person Hail
 *    END
 *
 * and Output:
 *    T. C. M.
 *    M. J. J.
 *    R. W. R.
 *    W. H. G.
 *    C. D.
 *    A. J. P. H.
 */

import java.util.*;

class Initials {
  public static void main(String[] args) {
    String name;
    String[] names;
    Scanner sc = new Scanner(System.in);
    int i;

    name = sc.nextLine();

    while(!name.equals("END")) {
      names = name.split(" ");

      for(i=0; i<names.length; i++) {
        System.out.print(names[i].charAt(0) + ". ");
      }
      System.out.println("");
      name = sc.nextLine();
    }
  }
}
