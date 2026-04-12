/*

input = 5

sample output:

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

*/

import java.util.Scanner;

public class LeftDiamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // loop to iterate through all the rows
    for (int i = 1; i <= (2 * n) - 1; i++) {
      // ternary operator to calculate the number of stars and spaces per row
      int stars = (i <= n) ? i : 2 * n - i;
      int spaces = (i <= n) ? n - i : i - n;

      // iterating and printing spaces in each row
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      // iterating and printing stars in each row
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      // move to next line after each row is completed
      System.out.println();
    }
    sc.close();
  }
}

// double loop approach

// // upper part
// for (int i = 1; i <= n; i++) {

// // inner loop to print spaces
// for (int j = 1; j <= n - i; j++) {
// System.out.print(" ");
// }

// // inner loop to print stars
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// // move to next line after completing the iteration in a row
// System.out.println();
// }

// // lower part
// for (int i = 1; i < n; i++) {
// // print spaces
// for (int j = 1; j <= i; j++) {
// System.out.print(" ");
// }
// // print stars
// for (int j = 1; j <= n - i; j++) {
// System.out.print("*");
// }
// // move to next line after completing the iteration in a row
// System.out.println();
// }