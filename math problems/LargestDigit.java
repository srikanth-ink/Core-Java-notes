
/*

Return the Largest Digit in a Number

You are given an integer n. Return the largest digit present in the number.


Example 1

Input: n = 25
Output: 5


Example 2

Input: n = 99
Output: 9

Explanation: The largest digit in 99 is 9.

*/

import java.util.Scanner;

public class LargestDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n = Math.abs(n);
    int res = logic(n);
    System.out.println(res);
  }

  public static int logic(int n) {
    int largest = 0;
    int rem = 0;

    while (n != 0) {
      rem = n % 10;
      n = n / 10;
      if (largest < rem) {
        largest = rem;
      }
    }
    return largest;
  }
}
