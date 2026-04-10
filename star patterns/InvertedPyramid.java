/*

input = 5

sample output:

*********
 *******
  *****
   ***
    *

*/

import java.util.Scanner;

public class InvertedPyramid {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 0; i < n; i++) {
      // inner loop to print spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // inner loop to print stars

      for (int j = 0; j < 2 * (n - i) - 1; j++) {
        System.out.print("*");
      }
      // move to next line after completing the iteration in a row
      System.out.println();
    }
    sc.close();
  }
}