/*

input = 5

sample output:

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/

import java.util.Scanner;

public class FloydTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // initialize a counter to track the numbers displayed
    int count = 1;

    // Outer loop handles the number of rows
    for (int i = 1; i <= n; i++) {
      // Inner loop handles the numbers printed in each row
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;
      }
      // Move to the next line after each row is complete
      System.out.println();
    }
    sc.close();
  }
}