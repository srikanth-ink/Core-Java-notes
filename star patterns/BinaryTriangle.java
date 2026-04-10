/*
 * 
 * input = 5
 * 
 * sample output:
 * 
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 */

import java.util.Scanner;

public class BinaryTriangle {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        // Check if the sum of the row and column indices is even
        if ((i + j) % 2 == 0) {
          // Print 1 if the sum of indices is even, otherwise print 0
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
    sc.close();
  }
}