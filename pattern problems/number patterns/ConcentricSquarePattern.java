/*

input = 5

sample output:

1 1 1 1 1 1 1 1 1 
1 2 2 2 2 2 2 2 1 
1 2 3 3 3 3 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 3 3 3 3 2 1 
1 2 2 2 2 2 2 2 1 
1 1 1 1 1 1 1 1 1

 */

import java.util.Scanner;

public class ConcentricSquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rows = 2 * n - 1;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
        int top = i;
        int left = j;
        int bottom = rows - i - 1;
        int right = rows - j - 1;

        int max_dist = Math.max(Math.max(top, left), Math.max(bottom, right));
        System.out.print((rows - max_dist) + " ");
      }
      System.out.println();
    }
  }
}