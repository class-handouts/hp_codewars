/**
 * This reads in a user's name and age and outputs how old he will be in
 * ten years.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class AgeProdictor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.next();
    int age = sc.nextInt();

    System.out.println(name + " will be " + (age+10) + " in ten years.");
  }
}
