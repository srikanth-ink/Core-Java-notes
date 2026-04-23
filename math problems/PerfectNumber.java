/*

Check for Perfect Number
You are given an integer n. You need to check if the number is a perfect number or not. Return true if it is a perfect number, otherwise, return false.
A perfect number is a number whose proper divisors (excluding the number itself) add up to the number itself.


Example 1
Input: n = 6
Output: true
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.

Example 2
Input: n = 4
Output: false
Explanation: Proper divisors of 4 are 1, 2.
1 + 2 = 3.

Constraints
1 <= n <= 5000

*/

import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
      int n = sc.nextInt();
      System.out.println(logic(n));
    }
    sc.close();
  }

  public static boolean logic(int n) {
    // Perfect numbers must be greater than 1
    if (n <= 1) {
      return false;
    }

    int sum = 0;
    // Iterate up to n/2 because no divisor (other than n) can be larger than n/2
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    // Check if the sum of proper divisors equals the original number
    return sum == n;
  }
}
