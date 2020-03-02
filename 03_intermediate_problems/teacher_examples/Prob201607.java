/** This is my solution to HP Code Wars Problem 7 from 2016 
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class Prob201607
{
   public static void main(String[] args) 
   {
      int[][] lettersCount = new int[3][26];
      int numOfWordTriplets;
      String[] words = new String[3];
      String[] ans;
      Scanner in = new Scanner(System.in);

      numOfWordTriplets = in.nextInt();
      ans = new String[numOfWordTriplets];
      zeroOut(lettersCount);

      for(int i=0; i<numOfWordTriplets; i++)
      {
         for(int j=0; j<3; j++)
         {
            words[j] = in.next();
            for(int k=0; k<words[j].length(); k++)
            {
               
            }
         }
      }




   }
   
   static int getCharValue(char ch)
   {
      if (ch == 'A')
         return 0;
      else if(ch == 'B')
         return 1;
      else if(ch == 'C')
         return 2;
      else if(ch == 'D')
         return 3;
      else if(ch == 'E')
         return 4;
      else if(ch == 'F')
         return 5;
      else if(ch == 'G')
         return 6;
      else if(ch == 'H')
         return 7;
      else if(ch == 'I')
         return 8;
      else if(ch == 'J')
         return 9;
      else if(ch == 'K')
         return 10;
      else if(ch == 'L')
         return 11;
      else if(ch == 'M')
         return 12;
      else if(ch == 'N')
         return 13;
      else if(ch == 'O')
         return 14;
      else if(ch == 'P')
         return 15;
      else if(ch == 'Q')
         return 16;
      else if(ch == 'R')
         return 17;
      else if(ch == 'S')
         return 18;
      else if(ch == 'T')
         return 19;
      else if(ch == 'U')
         return 20;
      else if(ch == 'V')
         return 21;
      else if(ch == 'W')
         return 22;
      else if(ch == 'X')
         return 23;
      else if(ch == 'Y')
         return 24;
      else if(ch == 'Z')
         return 25;

      return -1;
   }

   static int getMin(int a, int b, int c)
   {
      int ans = 0;

      if (a == 0 || b == 0 || c == 0)
         ans = 0;
      else if (a < b && a < c)
         ans = a;
      else if (b < a && b < c)
         ans = b;
      else
         ans = c;

      return ans;
   }
   
   static void zeroOut(int[][] arr)
   {
      for (int i = 0; i < arr.length; i++) 
      {
         for(int j=0; j<arr[0].length; j++)
            arr[i][j] = 0;
      }
         
   }
}