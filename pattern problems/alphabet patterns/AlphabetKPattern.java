/*

input = 5

sample output:

A B C D E 
A B C D 
A B C 
A B 
A 
A B
A B C
A B C D
A B C D E

*/

import java.util.Scanner;

public class AlphabetKPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < 2 * n - 1; i++) {
      int max_cols = (i < n) ? n - i : i - n + 2;

      for (int j = 0; j < max_cols; j++) {
        System.out.print(((char) (64 + j + 1)) + " ");
      }
      System.out.println();
    }
  }
}