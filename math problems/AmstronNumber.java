import java.util.Scanner;

public class AmstronNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = (int) Math.log10(n) + 1;
    int digit = 0;
    int sum = 0;
    int temp = n;

    while (n != 0) {
      digit = n % 10;
      n = n / 10;
      sum += Math.pow(digit, count);
    }
    if (sum == temp) {
      System.out.println("Amstrong number");
    } else {
      System.out.println("Not an amstrong number");
    }
  }
}
