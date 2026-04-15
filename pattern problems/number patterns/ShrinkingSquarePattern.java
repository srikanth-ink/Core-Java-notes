/*

input = 5

sample output:

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5

*/

import java.util.Scanner;

public class ShrinkingSquarePattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int size = 2 * n - 1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        // Find the minimum distance to any of the four edges
        int top = i;
        int left = j;
        int bottom = size - 1 - i;
        int right = size - 1 - j;

        int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

        // The value at (i, j) is n minus that minimum distance
        System.out.print((n - minDist) + " ");
      }
      // Move to the next line after each row
      System.out.println();
    }

  }
}