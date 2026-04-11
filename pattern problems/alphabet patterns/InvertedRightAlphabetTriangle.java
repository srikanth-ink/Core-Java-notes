/*

input = 5

sample output:

ABCDE
ABCD
ABC
AB
A

*/

import java.util.Scanner;

public class InvertedRightAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // iterates through each row
    for (int i = 0; i < n; i++) {
      // inner loo to print alphabets
      for (int j = 0; j < n - i; j++) {
        System.out.print((char) ('A' + j));
      }
      // move to nextline after the iteration through a row is finished
      System.out.println();
    }
    sc.close();
  }
}