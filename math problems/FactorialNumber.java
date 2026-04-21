/*

Check if the Number is Armstrong

You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.


Example 1

Input: n = 153
Output: true
Explanation: Number of digits : 3.
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.

Example 2
Input: n = 12
Output: false


Constraints:
0 <= n <= 109

*/

import java.util.Scanner;

public class FactorialNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean res = logic(n);
    System.out.println(res);
  }

  public static boolean logic(int n) {
    int temp = n;
    int rem = 0;
    int res = 0;
    int digits = String.valueOf(n).length();

    while (n > 0) {
      rem = n % 10;
      n = n / 10;
      res += Math.pow(rem, digits);
    }
    if (res == temp) {
      return true;
    }
    return false;
  }
}