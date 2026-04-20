/*

Palindrome Number

You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.
A palindrome number is a number which reads the same both left to right and right to left.


Example 1

Input: n = 121
Output: true


Example 2

Input: n = 123
Output: false


*/

import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    boolean res = logic(n);
    System.out.println(res);
  }

  // public static boolean logic(String n) {
  // String newStr = "";
  // int len = n.length();

  // for (int i = len - 1; i >= 0; i--) {
  // newStr += n.charAt(i);
  // }

  // if (n.equals(newStr)) {
  // return true;
  // }
  // return false;

  // better optimized solution
  public static boolean logic(String n) {
    int left = 0;
    int right = n.length() - 1;

    while (left < right) {
      if (n.charAt(left) != n.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
