/*

input = 5

sample output:

1        1
12      21
123    321
1234  4321
1234554321

*/

import java.util.Scanner;

public class NumberCrown {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      // print first number triangle using an inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      // print spaces with another inner loop
      for (int j = 1; j <= (2 * (n - i)); j++) {
        System.out.print(" ");
      }
      // print last number triangle using another inner loop
      for (int j = 0; j < i; j++) {
        System.out.print(i - j);
      }

      System.out.println();
    }
    sc.close();
  }
}