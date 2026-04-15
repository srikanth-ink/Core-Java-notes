/*

input = 5

sample output:

E E E E E E E E E 
E D D D D D D D E 
E D C C C C C D E 
E D C B B B C D E 
E D C B A B C D E 
E D C B B B C D E 
E D C C C C C D E 
E D D D D D D D E 
E E E E E E E E E

*/

import java.util.Scanner;

public class ConcentricAlphabetPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cols = 2 * n - 1;

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < cols; j++) {
        int top = i;
        int left = j;
        int bottom = cols - i - 1;
        int right = cols - j - 1;
        int max_dist = Math.max(Math.max(top, left), Math.max(bottom, right));
        System.out.print(((char) (65 + (max_dist - n) + 1)) + " ");
      }
      System.out.println();
    }
  }
}