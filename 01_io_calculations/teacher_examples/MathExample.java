/**
 * This shows some examples from the Math class.
 *
 * @author Mr. Dagler
 */

import java.util.*;

class MathExample {
  public static void main(String[] args) {
    System.out.println(3 + "^" + 4 + " = " + Math.pow(3,4));
    System.out.println(4 + "^(" + 3 + "/" + 2 + ") = "
     + Math.pow(4,3.0/2.0));
    System.out.println("Sqrt[" + 8 + "] = " + Math.sqrt(8));
    System.out.println("|" + -7.2 + "| = " + Math.abs(7.2));
    System.out.println("Round["+3. +"] = " + Math.round(3.6));
    System.out.println("Floor["+7.8+"] = " + Math.floor(7.8));
    System.out.println("Ceiling["+2.3+"] = " + Math.ceil(2.3));
    System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
    System.out.println("cos(pi) = " + Math.cos(Math.PI));
    System.out.println("tan(pi/4) = " + Math.tan(Math.PI/4));
    System.out.println("sin(180^0) = " + Math.sin(Math.toRadians(180)));
    System.out.println("asin(1.0) = " + Math.asin(1.0));
    System.out.println("acos(1.0/Sqrt[2]) = " + Math.acos(0.70710678));
    System.out.println("atan(1.0/Sqrt[3]) = "
     + Math.atan(1/Math.sqrt(3)) + " rads");
    System.out.println("atan(1.0/Sqrt[3]) = "
     + Math.toDegrees(Math.atan(1/Math.sqrt(3))) + " degs");
  }
}
