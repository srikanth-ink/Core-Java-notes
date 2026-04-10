/*

input = 5

sample output:

    *
   ***
  *****
 *******
*********

*/

import java.util.Scanner;

public class EquilateralTriangle {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 1; i <= n; i++) {
      // print spaces n-i times for each row
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // print stars (2*i)-1 times for each row
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      // move to next line after each iteration
      System.out.println();
    }
  }
}
