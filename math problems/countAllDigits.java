/*

Count all Digits of a Number

You are given an integer n. You need to return the number of digits in the number.
The number will have no leading zeroes, except when the number is 0 itself.

Sample input: n = 1213
Sample output: 4


Sample input: n = 222
Sample output: 3


*/

import java.util.Scanner;

public class countAllDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;

    // Use long to handle negatives and Integer.MIN_VALUE
    long temp = (long) Math.abs(n);

    do {
      count++;
      temp = temp / 10;
    } while (temp > 0);

    System.out.println(count);
  }
}