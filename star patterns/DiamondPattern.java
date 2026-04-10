/*

input = 5

sample output:

    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {

    // Take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through every row and print the upper pyramid
    for (int i = 1; i <= n; i++) {
      // inner loop to print spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // inner loop to print stars
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      // move to the next row
      System.out.println();
    }

    // outer loop to print the lower pyramid
    for (int i = 1; i <= n; i++) {
      // inner loop to print spaces
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      // inner loop to print stars
      for (int j = 1; j <= 2 * (n - i) + 1; j++) {
        System.out.print("*");
      }
      // move to the next row
      System.out.println();
    }
    sc.close();
  }
}