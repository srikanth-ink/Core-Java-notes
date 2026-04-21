/*

Factorial of a given number

You are given an integer n. Return the value of n! or n factorial.

Factorial of a number is the product of all positive integers less than or equal to that number.


Example 1

Input: n = 2
Output: 2
Explanation: 2! = 1 * 2 = 2.

Example 2

Input: n = 0
Output: 1
Explanation: 0! is defined as 1.

Constraints
0 <= n <= 10

*/

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int res = logic(n);
    System.out.println(res);
  }

  public static int logic(int n) {
    int res = n;
    if (n == 0) {
      return 1;
    }
    if (n >= 1 && n <= 10) {
      for (int i = n - 1; i >= 2; i--) {
        res *= i;
      }
    }
    return (n < 1 || n > 10) ? 0 : res;
  }
}