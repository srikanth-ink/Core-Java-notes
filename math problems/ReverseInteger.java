/*

Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Sample input x = 245
Sample output = 542

Sample input x = -123
Sample output =  -321

*/

import java.util.Scanner;

public class ReverseInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int res = 0;

    while (n != 0) {
      int rem = n % 10;
      n = n / 10;

      // Check overflow BEFORE updating res
      if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
        System.out.println(0);
        return;
      }

      res = res * 10 + rem;
    }

    System.out.println(res);
  }
}