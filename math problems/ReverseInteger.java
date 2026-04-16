// still needed to be upated!

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

    if (n < -231 || n > 232) {
      System.out.println(0);
    } else {
      int temp = Math.abs(n);
      int rem = 0;
      int res = 0;

      while (temp > 0) {
        rem = (temp % 10);
        res = (res * 10) + rem;
        temp = temp / 10;
      }
      if (n < 0) {
        System.out.println(-res);
      } else {
        System.out.println(res);
      }

    }
  }
}