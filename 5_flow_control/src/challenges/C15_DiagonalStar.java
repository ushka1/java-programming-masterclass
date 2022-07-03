package challenges;

public class C15_DiagonalStar {
  public static void printSquareStar(int n) {
    if (n < 5) {
      System.out.println("Invalid Value");
      return;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 ||
            i == n - 1 || j == n - 1 ||
            i == j ||
            j == n - (i + 1))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printSquareStar(8);
  }
}
