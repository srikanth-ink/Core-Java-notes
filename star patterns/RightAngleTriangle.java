import java.util.Scanner;

public class RightAngleTriangle {
  public static void main(String[] args) {

    // take the number of rows as input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    // outer loop to enter every row
    for (int i = 0; i < n; i++) {
      // inner loop to enter every column
      // print stars based on the current row number
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      // move to the next line when a row iteration is completed
      System.out.println();
    }
  }
}