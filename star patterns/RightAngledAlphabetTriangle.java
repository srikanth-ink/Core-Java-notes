/*

input = 5

sample output:

A
AB
ABC
ABCD
ABCDE

*/

import java.util.Scanner;

public class RightAngledAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // outer loop to iterate through each row
    for (int i = 1; i <= n; i++) {
      // Counter variable that resets to 65 ('A') for every row
      int count = 65;
      // Inner loop to print characters up to the current row number
      for (int j = 1; j <= i; j++) {
        System.out.print((char) count);
        count++;
      }
      // move to next line after each row is completed
      System.out.println();
    }
    sc.close();
  }
}